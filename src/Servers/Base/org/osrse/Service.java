/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse;

import org.osrse.utility.OutputDisplay;

/**
 * @author Jonathan
 */
public class Service {

    /**
     * @param args [database] [client_revision] [world_id] [lobby_id] [master_address]
     *             lobby_id and master_address are both optional.
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try {
            final Module module;
            final Class<Module> service;
            boolean databasePolicy = args.length == 0 || args.length >= 3 && Boolean.parseBoolean(args[0]);
            if (args.length < 2) {
                module = forName("MasterModule").newInstance();
            } else {
                int clientRevision = Integer.parseInt(args[1]);
                int gameWorld = Integer.parseInt(args[2]);

                boolean enterpriseService = args.length > 3 && !args[3].contains(".");
                int lobbyId = enterpriseService ? Integer.parseInt(args[3]) : -1;
                String commercial_addr = args.length > (enterpriseService ? 4 : 3) ? args[enterpriseService ? 4 : 3] : null;
                service = forName(enterpriseService ? "EnterpriseModule" : "WorldModule");
                if (enterpriseService) {
                    module = service.getConstructor(Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class)
                            .newInstance(gameWorld, lobbyId, clientRevision, commercial_addr);
                } else {
                    module = service.getConstructor(Integer.TYPE, Integer.TYPE, String.class)
                            .newInstance(gameWorld, clientRevision, commercial_addr);
                }
            }
            /**
             * Load settings that are the same in both Modules.
             * Then loads the custom settings in each module extender
             */
            module.prepare();
            /**
             * Here we run the custom method in each Module
             */
            System.out.println("Starting network...");
            module.commenceNetworking();

            /**
             * To finish it we initialize both
             * the networking manager, and
             * the main thread for updating in each module
             */
            module.computeElement(databasePolicy);
            /**
             * Reset Indentation, and tell the user the server is ready for input.
             */
            OutputDisplay.finish();
        } catch (Exception e) {
            OutputDisplay.printError(e);
        }
    }

    /**
     * allows package seperation
     *
     * @param name classname
     * @return
     * @throws ClassNotFoundException
     */
    public static Class<Module> forName(String name) throws ClassNotFoundException {
        return (Class<Module>) Class.forName("org.osrse." + name);
    }
}

 package org.osrse;

 import org.osrse.model.ModuleStore;
 import org.osrse.game.GameBase;
import org.osrse.game.file.Library;
import org.osrse.game.file.player.LoadableContext;
 import org.osrse.game.network.MultiPacketDispatcher;
 import org.osrse.game.network.HandshakeDecoder;
 import org.osrse.slave.CommercialProtocol;
import org.osrse.slave.CommercialServiceHandler;
 import org.osrse.network.handler.MessageDecoder;
 import org.osrse.network.handler.ServiceHandler;

 import java.io.IOException;
import java.util.logging.Level;

 /**
 *
 * @author Jonathan
 */
public class WorldModule extends Module {

     protected static String commercialAddress;
     protected static int secondaryPort = -1;

     public WorldModule(Type type, ModuleStore base, String commercialAddress) {
         super(type, base);
         WorldModule.commercialAddress = commercialAddress;
     }

    public WorldModule(int worldId, int revision, String commercialAddress) throws Exception {
        this(Type.WORLD, new GameBase(worldId, revision), commercialAddress);
    }

    public static boolean isCommercial() {
        return commercialAddress != null;
    }

    @Override
    protected final void load() {
        try {
            LoadableContext.setup(isCommercial());
            Library.start(getLogic().getRevision());
            System.out.println("Loaded cache.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    protected void commenceNetworking() {
        try {
            manager.setNetwork(new MultiPacketDispatcher(), true, "", moduleBase.getReferencePort(), secondaryPort)
                   .setHandlers(new ServiceHandler(), new HandshakeDecoder());
            if (isCommercial()) {
                manager.setNetwork(new CommercialProtocol(), false, commercialAddress, 40000)
                       .setHandlers(new CommercialServiceHandler(), new MessageDecoder(manager.getClientNetwork()));
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(WorldModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static GameBase getLogic() {
        return (GameBase) moduleBase;
    }

     public static String getProtocolDirectory(String dir) {
         return getProtocolDirectory(getLogic().getRevision(), dir);
     }

     public static String getProtocolDirectory(int revision, String dir) {
         return "./data/"+type.getDirectory()+"/protocol/"+revision+"/"+dir+"/";
     }
}

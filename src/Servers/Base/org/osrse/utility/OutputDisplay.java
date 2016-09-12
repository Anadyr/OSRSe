/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.utility;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Lazaro, Jonathan
 */
public class OutputDisplay {
    protected static final Object lock = new Object();
    /**
     * The logger for this class.
     */
    private static final Logger logger = Logger.getLogger(Logger.class.getName());
	protected static int indentationLevel = 0;
	protected static boolean textOnLine = false;
	private static boolean ready;

    public static void decrement() {
        indentationLevel -= 2;
    }

    public static void increment() {
        indentationLevel += 2;
    }

    public static void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("  ____   _____ _____   _____");
        System.out.println(" / __ \\ / ____|  __ \\ / ____|");
        System.out.println("| |  | | (___ | |__) | (___   ___");
        System.out.println("| |  | |\\___ \\|  _  / \\___ \\ / _ \\");
        System.out.println("| |__| |____) | | \\ \\ ____) |  __/");
        System.out.println(" \\____/|_____/|_|  \\_\\_____/ \\___|");
        System.out.println("-----------------------------------");
    }

    public static void resetIndentation() {
        indentationLevel = 0;
    }


    public static void setupLogging() {
        System.setOut(new PrintStream(System.out) {
            @Override
            public void print(String string) {
                if(!ready) {
                    if (string.length() > 0) {
                        synchronized (lock) {
                            if (!textOnLine) {
                                for (int i = 0; i < indentationLevel; i++) {
                                    super.print(" ");
                                }
                                if (string.charAt(string.length() - 1) != '\n') {
                                    textOnLine = true;
                                }
                            } else if (string.charAt(string.length() - 1) == '\n') {
                                textOnLine = false;
                            }
                            super.print(string);
                        }
                    }
                } else {
                    logger.logp(Level.INFO, "", "", string);
                }
            }

            @Override
            public void println() {
                print("\n");
            }

            @Override
            public void println(String string) {
                print(string + (!ready ? "\n" : ""));
            }
        });

        System.setErr(new PrintStream(System.err) {
            @Override
            public void print(String string) {
                if(!ready) {
                    if (string.length() > 0) {
                        synchronized (lock) {
                            if (!textOnLine) {
                                for (int i = 0; i < indentationLevel; i++) {
                                    super.print(" ");
                                }
                                if (string.charAt(string.length() - 1) != '\n') {
                                    textOnLine = true;
                                }
                            } else if (string.charAt(string.length() - 1) == '\n') {
                                textOnLine = false;
                            }
                            super.print(string);
                        }
                    }
                } else {
                    logger.logp(Level.WARNING, "", "", string);
                }
            }

            @Override
            public void println() {
                print("\n");
            }

            @Override
            public void println(String string) {
                print(string + (!ready ? "\n" : ""));
            }
        });
    }

    public static void printError(Exception e) {
        StringWriter writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        e.printStackTrace(printWriter);
        printWriter.flush();
        writer.write("Attention! " + e + "\r");
        writer.write("There was an error with your startup arguments!\r");
        writer.write("Please check below and review your arguments used to continue.\r");
        writer.write("--------------------------------------------------------------------------------------------------\n");
        writer.write("Terms to understand:\n");
        writer.write("StandAlone World: a world server with no lobby.\n");
        writer.write("StandAlone Enterprise: a world and lobby server not using a loginserver\n");
        writer.write("--------------------------------------------------------------------------------------------------\n");
        writer.write("StandAlone World [client_revision] [world_id]\n");
        writer.write("    This is a basic world, with no login server or lobby.\n");
        writer.write("World Server [client_revision] [world_id] [master_address]\n");
        writer.write("    This is a single world, connected to a login server.\n");
        writer.write("StandAlone Enterprise [client_revision] [world_id] [lobby_id]\n");
        writer.write("    This is both a world and lobby server, but doesnt allow mutliple worlds.\n");
        writer.write("Enterprise Server [client_revision] [world_id] [lobby_id] [master_address]\n");
        writer.write("    This is the entire protocol Lobby and world server together connected to a login server.\n");
        writer.write("--------------------------------------------------------------------------------------------------\n");
        writer.write("[client_revision] The client version which you wish to emulate.\n");
        writer.write("[world_id] The world number you want, if you are running enterprise mode use 0, then the world Id\n");
        writer.write("[lobby_id] The lobby number you wish to be seen.\n");
        writer.write("[master_address] The address of the Login server for multiple world emulation.\n");
        writer.write("[lobby_id] and [master_address], are both optional for non enterprise servers.\n");
        System.err.println(writer.toString());
    }

    public static void printMultiple(int[] ports, String s) {
        if (ports.length > 1) {
            s += "s";
        }
        for (int i = 0; i < ports.length; i++) {
            if (i == 0) {
                s += ": ";
            } else if (i == ports.length - 1) {
                s += ", and ";
            } else {
                s += ", ";
            }
            s += ports[i];
        }
        s += ".";
        System.out.println(s);
    }

    public static void finish() {
        resetIndentation();
        System.out.println("Ready.");
        System.out.println();
        ready = true;
    }
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osrse;

import org.osrse.model.ModuleStore;
import org.osrse.network.ServiceManager;
import org.osrse.network.database.DatabaseManager;
import org.osrse.task.Engine;
import org.osrse.utility.JSManager;
import org.osrse.utility.NameUtilities;
import org.osrse.utility.OutputDisplay;

import java.io.File;
import java.util.Random;

/**
 * @author Jonathan
 */
public abstract class Module {
    public static final Random random = new Random();
    /**
     * Main module used
     */
    protected static final ServiceManager manager = new ServiceManager();
	public static JSManager js;
	protected static ModuleStore moduleBase;
	protected static Type type;
	private static boolean databasePolicy = false;

    protected Module(Type type, ModuleStore moduleBase) {
        Module.type = type;
        Module.moduleBase = moduleBase;
    }

	public static boolean hasDatabasePolicy() {
		return databasePolicy;
	}

	public static boolean reloadScripts() {
		try {
			JSManager js2 = new JSManager(new File(getFile("scripts").substring(2)));
			js = js2;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String getFile(String name) {
		return "./data/" + type.getDirectory() + "/" + name;
	}

	public static Type getModule() {
		return type;
	}

	public static ServiceManager getManager() {
		return manager;
	}

	public static int random(int x) {
		return (int) (Math.random() * (x + 1));
	}

	public static int random(int x, int y) {
		return (int) (x + Math.random() * (y - x));
	}

    protected abstract void commenceNetworking();

    protected final void computeElement(boolean databasePolicy) {
        Module.databasePolicy = databasePolicy;
        OutputDisplay.increment();
        if (databasePolicy) {
            DatabaseManager.constructPool();
        }
        manager.program();
        OutputDisplay.decrement();
        System.out.println("Initializing environment.");
        Engine.start(moduleBase, type.cycleValue());
    }

    /**
     * used for important prelogic files
     */
    protected abstract void load();

    public void prepare() throws Exception {
        OutputDisplay.setupLogging();
        OutputDisplay.printInfo();
        System.out.println("Starting " + type + " module...");
        OutputDisplay.increment();
        load();
        moduleBase.start();
    }

	/**
	 * Master - Loginserver
	 * World - solo world server connected to master
	 * Enterprise - world/lobby connected to master
	 */
	public enum Type {
		MASTER(0), WORLD(1), ENTERPRISE(2);
		private final int id;

		Type(int id) {
			this.id = id;
		}

		public int intValue() {
			return id;
		}

		public int cycleValue() {
			return 600;
		}

		public String getDirectory() {
			return id == 0 ? toString() : WORLD.toString();
		}

		@Override
		public String toString() {
			return NameUtilities.displayFormat(super.toString()).toLowerCase();
		}
	}
}

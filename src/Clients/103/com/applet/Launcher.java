package com.applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.swing.*;

import com.jagex.Class116_Sub16;
import com.jagex.Class116_Sub23_Sub13;
import com.jagex.Class42;
import com.jagex.client;


public class Launcher {

	private static final long serialVersionUID = -1657955994522660237L;
    public static JFrame frame;
    public static JPanel gamepanel;
	private String host;
	private client clnt;
	public static boolean rsps = true;
	private Properties map;
    private static int world = 1;

    public Launcher(JPanel gamePanel) {
        gamepanel = gamePanel;startApplet();
    }

    public static void main(String[] args) {
		Launcher app = new Launcher();
        if(args != null && args.length > 0) {
            if(args[0].contains("t") || args[0].contains("f")) {
                rsps = Boolean.parseBoolean(args[0]);
            } else
            world = Integer.parseInt(args[0]);

        }
		app.startApplet();
	}

	public Launcher() {
        frame = new JFrame("Jagex #103");
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);
        frame.setDefaultCloseOperation(3);
	}

	public void startApplet() {
		try {
			map = new Properties();
			map.put("1", "0");
			map.put("2", "0");
			map.put("3", "0");
			map.put("4", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
			map.put("5", "");
            if(rsps) {
                host = new String("http://127.0.0.1/");
			    map.put("6", ""+world);
                map.put("10", "1");
            } else {
                host = new String("http://127.0.0.1/");
                map.put("6", "1");
                map.put("10", "0");
            }
			map.put("7", "true");
			map.put("8", "55487");
			map.put("9", ".runescape.com");
			map.put("11", "5");
			map.put("12", "true");
			map.put("13", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
			map.put("14", "536870912");
			map.put("15", "false");

            final AppletStubContext stub = AppletStubContext.create(map, new URL(host));
            final Applet app = (Applet) new client();
			app.setStub(stub);
            app.init();
            app.start();
            app.setPreferredSize(new Dimension(765, 503));
            frame.getContentPane().add(app, BorderLayout.WEST);
            frame.pack();
            frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getParameter(String key) {
		return (String) map.get(key);
	}

	public static void dumpCS2Scripts(Object[] params) {
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < params.length; i++) {
			Object obj = params[i];
			if (obj instanceof String) {
				builder.append("\"" + ((String) obj) + "\"" + ((i == params.length - 1) ? "" : ", "));
			} else {
				builder.append("" + ((Integer) obj) + "" + ((i == params.length - 1) ? "" : ", "));
			}
		}
		System.out.println("sendCS2Script(" + params[0] + ", newcache Object[] { " + builder.toString() + " });");
	}


	public static void dumpMap(int region, int[] keys) {

        if(region != -1) return;
		//System.out.println("Region: "+ region + "keys: " + Arrays.toString(keys));
        if(keys == null) {
            return;
        }
		File file = new File("./data/map/" + region + ".txt");
		try {
			if (file.createNewFile()) {
				try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
					for (int key : keys) {
						writer.write(String.valueOf(key));
						writer.newLine();
					}
					writer.flush();
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    private static boolean[] dumped = new boolean[256];
    private static int[] lengths = new int[256];

    public static void dumpOpcode(int i) {
        if(!dumped[i]) {
            dumped[i] = true;
	        System.out.println("opcode="+i );
        }
    }
}

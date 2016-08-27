package com.applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class AppletStubContext implements AppletStub, AppletContext, Enumeration {

	public static boolean ALLOW_SHOW_DOCUMENT = false;
	private int nextElementCalled = 0;
	private final HashMap<String, InputStream> appletStreams = new HashMap<String, InputStream>();
	private final HashMap<String, String> parameters = new HashMap<String, String>();
	private URL codeBase;
	private URL documentBase;

	public AppletStubContext() {
		super();
	}

	@Override
	public void appletResize(final int var1, final int height) {
	}

	@Override
	public AppletContext getAppletContext() {
		return this;
	}

	@Override
	public URL getCodeBase() {
		return codeBase;
	}

	public void setCodeBase(final URL codeBase) {
		this.codeBase = codeBase;
	}

	@Override
	public URL getDocumentBase() {
		return documentBase;
	}

	public void setDocumentBase(final URL documentBase) {
		this.documentBase = documentBase;
	}

	@Override
	public String getParameter(final String name) {
		return getParameters().get(name);
	}

	public void putParameter(final String var1, final String value) {
		getParameters().put(var1, value);
	}

	@Override
	public boolean isActive() {
		return true;
	}

	@Override
	public java.applet.AudioClip getAudioClip(final URL url) {
		return null;// newcache AudioClip(url);
	}

	@Override
	public Image getImage(final URL url) {
		return Toolkit.getDefaultToolkit().createImage(url);
	}

	@Override
	public Applet getApplet(final String name) {
		return null;
	}

	@Override
	public Enumeration getApplets() {
		return this;
	}

	@Override
	public void showDocument(final URL var1) {
		if (ALLOW_SHOW_DOCUMENT && Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(var1.toURI());
			} catch (final IOException var3) {
				var3.printStackTrace();
			} catch (final URISyntaxException var4) {
				var4.printStackTrace();
			}
		} else {
			var1.toString().contains("runescape.com/l=");
		}

	}

	@Override
	public void showDocument(final URL var1, final String target) {
		this.showDocument(var1);
	}

	@Override
	public void showStatus(final String status) {
		System.out.println(status);
	}

	@Override
	public void setStream(final String var1, final InputStream stream) throws IOException {
		appletStreams.put(var1, stream);
	}

	@Override
	public InputStream getStream(final String key) {
		return appletStreams.get(key);
	}

	@Override
	public Iterator getStreamKeys() {
		return appletStreams.keySet().iterator();
	}

	@Override
	public boolean hasMoreElements() {
		return nextElementCalled == 0;
	}

	@Override
	public Applet nextElement() throws NoSuchElementException {
		++nextElementCalled;
		if (nextElementCalled != 1) {
			throw new NoSuchElementException();
		} else {
			return null;
		}
	}

	public static AppletStubContext create(final Properties var0, final URL var1) {
		final AppletStubContext var2 = new AppletStubContext();
		var2.setCodeBase(var1);
		var2.setDocumentBase(var1);
		final Iterator var4 = var0.keySet().iterator();

		while (var4.hasNext()) {
			final Object key = var4.next();
            var2.putParameter(key.toString(), var0.get(key).toString());
			System.out.println("client_parameters.put(\"" + key + "\" , \"" + var0.get(key) + "\");");
		}

		return var2;
	}

	public HashMap<String, String> getParameters() {
		return parameters;
	}
}

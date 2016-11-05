package com.stevenchi.flytunnels.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.stevenchi.flytunnels.FlyTunnels;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlyTunnels.WIDTH;
		config.height = FlyTunnels.HEIGHT;
		config.title = FlyTunnels.TITLE;
		new LwjglApplication(new FlyTunnels(), config);
	}
}

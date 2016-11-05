package com.stevenchi.flytunnels;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.stevenchi.flytunnels.States.GameStateManager;
import com.stevenchi.flytunnels.States.MenuState;

public class FlyTunnels extends ApplicationAdapter {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 480;
	public static final String TITLE = "Fly Tunnels";

	private GameStateManager gsn;
	private SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsn = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsn.push(new MenuState(gsn));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsn.update(Gdx.graphics.getDeltaTime());
		gsn.render(batch);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

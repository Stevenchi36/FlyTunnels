package com.stevenchi.flytunnels.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.stevenchi.flytunnels.FlyTunnels;

/**
 * Created by Steven on 11/4/2016.
 */

public class MenuState extends States {

    private Texture background;
    private Texture playButton;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("background.png");
        playButton = new Texture("playButton.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlyTunnels.WIDTH, FlyTunnels.HEIGHT);
        sb.draw(playButton, (FlyTunnels.WIDTH / 2) - (playButton.getWidth() / 2), (FlyTunnels.HEIGHT / 2) - playButton.getHeight() / 2);
        sb.end();
    }
}

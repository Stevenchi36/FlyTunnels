package com.stevenchi.flytunnels.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Steven on 11/5/2016.
 */

public class PlayState extends States {
    private Texture ship;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        ship = new Texture("");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {

    }

    @Override
    public void dispose() {

    }
}

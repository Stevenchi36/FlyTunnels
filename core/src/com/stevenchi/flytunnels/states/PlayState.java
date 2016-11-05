package com.stevenchi.flytunnels.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.stevenchi.flytunnels.sprites.Bird;
import com.stevenchi.flytunnels.sprites.Ship;

/**
 * Created by Steven on 11/5/2016.
 */

public class PlayState extends States {

    private Ship ship;
    private Bird bird;
    private Texture background;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        ship = new Ship(50, 250);
        bird = new Bird();
        background = new Texture("background.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            ship.fly();
        }
    }

    @Override
    public void update(float dt) {

        handleInput();
        ship.update(dt);
        bird.update(dt);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, cam.position.x - cam.viewportWidth / 2, 0);
        sb.draw(ship.getTexture(), ship.getPosition().x, ship.getPosition().y);
        sb.draw(bird.getBird(), bird.getPosition().x, bird.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}

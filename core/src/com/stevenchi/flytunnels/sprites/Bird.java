package com.stevenchi.flytunnels.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.stevenchi.flytunnels.FlyTunnels;

import java.util.Random;

/**
 * Created by Steven on 11/5/2016.
 */

public class Bird {

    private static final int FLUCTUATION = 130;
    private static final int LOWEST_OPENING = 50;
    private Vector2 position;
    private Vector3 velocity;
    private Random rand;

    private Texture bird;

    public Bird(){
        bird = new Texture("bird.png");
        rand = new Random();
        position = new Vector2(805, rand.nextInt(FlyTunnels.HEIGHT - bird.getHeight()));
        velocity = new Vector3(-250, 0, 0);
    }

    public void update(float dt){
        velocity.scl(dt);
        position.add(velocity.x, 0);
        velocity.scl(1/dt);
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector3 getVelocity() {
        return velocity;
    }

    public Texture getBird() {
        return bird;
    }

    public void reposition(int x){
        position.set(805, rand.nextInt(FlyTunnels.HEIGHT - bird.getHeight()));
    }
}

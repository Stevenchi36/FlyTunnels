package com.stevenchi.flytunnels.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Steven on 11/5/2016.
 */

public class Ship {

    private Vector3 position;
    private Vector3 velocity;

    private Texture ship;

    public Ship(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0, 0, 0);
        ship = new Texture("ship.png");
    }

}

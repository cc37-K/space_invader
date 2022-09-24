package com.mygdx.spaceshooter;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

import java.util.concurrent.RecursiveAction;

public class Laser {
    // laser physical characteristics
    float movementSpeed; // world units per second

    // position and dimensions
//    float xPosition, yPosition; // bottom centre of the laser
//    float width, height;
    Rectangle boundingBox;

    //graphics
    TextureRegion textureRegion;

    public Laser(float xCentre, float yBottom,
                 float width, float height,
                 float movementSpeed, TextureRegion textureRegion) {
//        this.xPosition = xCentre - width/2;
//        this.yPosition = yBottom;
//        this.width = width;
//        this.height = height;
        this.boundingBox = new Rectangle(xCentre-width/2,yBottom,width,height);
        this.movementSpeed = movementSpeed;
        this.textureRegion = textureRegion;
    }

    public void draw(Batch batch){
        batch.draw(textureRegion,boundingBox.x,boundingBox.y,boundingBox.width,boundingBox.height);
    }

//    public Rectangle getBoundingBox(){
//        return new Rectangle(xPosition,yPosition,width,height);
//    }
}

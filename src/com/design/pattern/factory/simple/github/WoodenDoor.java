package com.design.pattern.factory.simple.github;

/**
 * 木门
 */
public class WoodenDoor implements Door {
    private float width;
    private float height;
    
    public WoodenDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getWidth() {
        return this.width;
    }
    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "WoodenDoor [height=" + height + ", width=" + width + "]";
    }

}

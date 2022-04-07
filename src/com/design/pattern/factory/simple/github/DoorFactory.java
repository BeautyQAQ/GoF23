package com.design.pattern.factory.simple.github;

/**
 * 门工厂
 */
public class DoorFactory {
    public static Door makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}

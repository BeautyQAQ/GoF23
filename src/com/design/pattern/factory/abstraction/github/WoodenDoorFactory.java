package com.design.pattern.factory.abstraction.github;

/**
 * 木工厂返回木匠和木门
 */
public class WoodenDoorFactory implements DoorFactory {

    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
    
}

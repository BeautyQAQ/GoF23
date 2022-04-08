package com.design.pattern.factory.abstraction.github;

/**
 * 铁门工厂创建铁门和铁门专家
 */
public class IronDoorFactory implements DoorFactory {

    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
    
}

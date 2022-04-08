package com.design.pattern.factory.abstraction.github;

public class Main {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door door = woodenDoorFactory.makeDoor();
        DoorFittingExpert expert = woodenDoorFactory.makeFittingExpert();
        door.getDescription();
        expert.getDescription();

        IronDoorFactory ironFactory = new IronDoorFactory();
        Door ironDoor = ironFactory.makeDoor();
        DoorFittingExpert fittingExpert = ironFactory.makeFittingExpert();
        ironDoor.getDescription();
        fittingExpert.getDescription();
    }
}

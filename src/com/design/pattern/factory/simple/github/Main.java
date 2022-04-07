package com.design.pattern.factory.simple.github;

public class Main {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 200);
        System.out.println(door);
        // Door door2 = DoorFactory.makeDoor(50, 100);
    }
}

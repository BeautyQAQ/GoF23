package com.design.pattern.proxy.github;

public class Main {
    public static void main(String[] args) {
        SecuredDoor securedDoor = new SecuredDoor(new LabDoor());
        securedDoor.open("11111");
        securedDoor.open("12345");
        securedDoor.close();
    }
}

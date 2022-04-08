package com.design.pattern.factory.abstraction.github;

/**
 * 木门
 */
public class WoodenDoor implements Door {

    @Override
    public void getDescription() {
        System.out.println("I am a wooden door");        
    }
    
}

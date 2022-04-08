package com.design.pattern.factory.abstraction.github;

/**
 * 木匠
 */
public class Carpenter implements DoorFittingExpert {

    @Override
    public void getDescription() {
        System.out.println("I can only fit wooden doors");        
    }
    
}

package com.design.pattern.factory.abstraction.github;

/**
 * 焊机
 */
public class Welder implements DoorFittingExpert {

    @Override
    public void getDescription() {
        System.out.println("I can only fit iron doors");        
    }
    
}

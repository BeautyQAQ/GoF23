package com.design.pattern.visitor.github;

public class Dolphin implements Animal {

    public void speak(){
        System.out.println("Tttt");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDolphin(this);        
    }
    
}

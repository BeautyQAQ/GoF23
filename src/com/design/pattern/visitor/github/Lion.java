package com.design.pattern.visitor.github;

public class Lion implements Animal {

    public void roar(){
        System.out.println("Roar!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }
    
}

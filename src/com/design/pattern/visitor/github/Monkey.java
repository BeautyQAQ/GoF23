package com.design.pattern.visitor.github;

public class Monkey implements Animal {

    public void shout(){
        System.out.println("Ooh oo aa aa!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }
}

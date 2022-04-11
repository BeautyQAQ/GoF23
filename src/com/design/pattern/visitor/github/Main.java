package com.design.pattern.visitor.github;

public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Dolphin dolphin = new Dolphin();
        Speak speak = new Speak();
        monkey.accept(speak);
        lion.accept(speak);
        dolphin.accept(speak);

        Jump jump = new Jump();

        monkey.accept(jump);
        lion.accept(jump);
        dolphin.accept(jump);
    }
}

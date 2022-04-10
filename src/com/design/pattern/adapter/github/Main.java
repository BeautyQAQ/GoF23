package com.design.pattern.adapter.github;

public class Main {
    public static void main(String[] args) {
        WildDog wildDog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);
        Hunter hunter = new Hunter();
        hunter.hunt(wildDogAdapter);
    }
}

package com.design.pattern.factory.builder.github;

public class Main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder(14).addCheese().addLettuce().addPepperoni().addTomato().build();
        System.out.println(burger);
    }
}

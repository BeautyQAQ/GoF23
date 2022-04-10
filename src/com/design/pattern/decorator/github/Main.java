package com.design.pattern.decorator.github;

public class Main {
    public static void main(String[] args) {
        SimpleCoffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getCost());
        System.out.println(simpleCoffee.getDescription());

        MilkCoffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println(milkCoffee.getCost());
        System.out.println(milkCoffee.getDescription());

        WhipCoffee whipCoffee = new WhipCoffee(simpleCoffee);
        System.out.println(whipCoffee.getCost());
        System.out.println(whipCoffee.getDescription());

        VanillaCoffee vanillaCoffee = new VanillaCoffee(simpleCoffee);
        System.out.println(vanillaCoffee.getCost());
        System.out.println(vanillaCoffee.getDescription());
    }
}

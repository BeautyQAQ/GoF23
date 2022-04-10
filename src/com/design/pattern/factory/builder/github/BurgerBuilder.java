package com.design.pattern.factory.builder.github;

/**
 * 汉堡建设者
 */
public class BurgerBuilder {
    public int size;
    public boolean pepperoni;
    public boolean cheese;
    public boolean lettuce;
    public boolean tomato;

    public BurgerBuilder(int size){
        this.size = size;
    }

    public BurgerBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public BurgerBuilder addLettuce(){
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addCheese(){
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addTomato(){
        this.tomato = true;
        return this;
    }

    public Burger build(){
        return new Burger(this);
    }
}

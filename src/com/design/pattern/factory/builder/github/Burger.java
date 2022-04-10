package com.design.pattern.factory.builder.github;

/**
 * 汉堡
 */
public class Burger {
    protected int size;
    /**
     * 是否需要芝士
     */
    protected boolean cheese = false;
    /**
     * 是否需要意大利辣香肠
     */
    protected boolean pepperoni = false;
    /**
     * 是否需要生菜
     */
    protected boolean lettuce = false;
    
    /**
     * 是否需要番茄
     */
    protected boolean tomato = false;

    public Burger(BurgerBuilder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    @Override
    public String toString() {
        return "Burger [cheese=" + cheese + ", lettuce=" + lettuce + ", pepperoni=" + pepperoni + ", size=" + size
                + ", tomato=" + tomato + "]";
    }

}
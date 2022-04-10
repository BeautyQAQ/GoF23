package com.design.pattern.builder.github;

/**
 * 汉堡
 */
public class Burger {
    private int size;
    /**
     * 是否需要芝士
     */
    private boolean cheese = false;
    /**
     * 是否需要意大利辣香肠
     */
    private boolean pepperoni = false;
    /**
     * 是否需要生菜
     */
    private boolean lettuce = false;
    
    /**
     * 是否需要番茄
     */
    private boolean tomato = false;

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
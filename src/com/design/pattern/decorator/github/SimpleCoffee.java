package com.design.pattern.decorator.github;

/**
 * 简单是实现咖啡
 */
public class SimpleCoffee implements Coffee {

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";        
    }
    
}

package com.design.pattern.decorator.github;

/**
 * 想要使代码易于扩展，在需要时允许通过选项修改它。
 * 做一些附加组件（装饰器）
 * 
 * 牛奶咖啡，+2元
 */
public class MilkCoffee implements Coffee {

    private Coffee coffee;

    public MilkCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    /**
     * 加2元
     */
    @Override
    public int getCost() {
        return this.coffee.getCost() + 2;
    }

    /**
     * 加牛奶
     */
    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", milk";
    }
    
}

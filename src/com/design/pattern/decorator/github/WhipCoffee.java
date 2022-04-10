package com.design.pattern.decorator.github;

/**
 * 想要使代码易于扩展，在需要时允许通过选项修改它。
 * 做一些附加组件（装饰器）
 * 
 * 奶油咖啡，+5元
 */
public class WhipCoffee implements Coffee {

    private Coffee coffee;

    public WhipCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    /**
     * 加5元
     */
    @Override
    public int getCost() {
        return this.coffee.getCost() + 5;
    }

    /**
     * 加奶油
     */
    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", whip";
    }
    
}

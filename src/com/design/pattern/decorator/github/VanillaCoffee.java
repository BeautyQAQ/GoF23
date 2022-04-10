package com.design.pattern.decorator.github;

/**
 * 想要使代码易于扩展，在需要时允许通过选项修改它。
 * 做一些附加组件（装饰器）
 * 
 * 香草咖啡，+3元
 */
public class VanillaCoffee implements Coffee {
    private Coffee coffee;

    public VanillaCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    /**
     * 加3元
     */
    @Override
    public int getCost() {
        return this.coffee.getCost() + 3;
    }

    /**
     * 加香草
     */
    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", vanilla";
    }
}

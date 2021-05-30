package com.design.pattern.factory.method;

/**
 * 工厂方法
 * 在简单工厂模式的基础上抽象一层
 * 需要添加新的车时,只需要拓展一个新的车工厂,更符合开闭原则
 * 但是同时也带来了代码和管理上的复杂度增加
 */
public interface CarFactory {
    Car getCar();
}

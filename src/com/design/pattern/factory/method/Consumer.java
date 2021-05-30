package com.design.pattern.factory.method;

public class Consumer {
    public static void main(String[] args) {
        Car car = new TeslaFactory().getCar();
        Car car1 =new WuLingFactory().getCar();
        car.name();
        car1.name();
    }

    //优点:
    //结构复杂度: simple
    //代码复杂度: simple
    //编程复杂度: simple
    //管理复杂度: simple

    //根据设计原则: 工厂方法模式
    //根据实际业务: 简单工厂模式
}

package com.design.pattern.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();
    }
}

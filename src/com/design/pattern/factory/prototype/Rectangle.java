package com.design.pattern.factory.prototype;

/**
 * 矩形
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle: draw() method.");
    }
}
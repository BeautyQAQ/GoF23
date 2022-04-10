package com.design.pattern.prototype.github;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.println("Shape : " + shape.getType());

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + shape2.getType());

        Shape shape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + shape3.getType());
    }
}

package com.design.pattern.singleton.github;

public class Main {
    public static void main(String[] args) {
        President instance = President.getInstance();
        President instance1 = President.getInstance();
        System.out.println(instance==instance1);
    }
}

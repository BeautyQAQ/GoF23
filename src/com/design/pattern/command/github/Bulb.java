package com.design.pattern.command.github;

/**
 * 接收器
 * 灯泡
 */
public class Bulb {
    public void turnOn(){
        System.out.println("Bulb has been lit");
    }

    public void turnOff(){
        System.out.println("Darkness!");
    }
}

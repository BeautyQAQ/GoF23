package com.design.pattern.factory.abstraction;

public class XiaomiPhone implements IPhoneProduce {

    @Override
    public void call() {
        System.out.println("小米手机打电话");        
    }

    @Override
    public void sendMsg() {
        System.out.println("小米手机发短信");
    }
    
}

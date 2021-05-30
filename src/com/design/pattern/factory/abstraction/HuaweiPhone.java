package com.design.pattern.factory.abstraction;

public class HuaweiPhone implements IPhoneProduce {

    @Override
    public void call() {
        System.out.println("华为手机打电话");        
    }

    @Override
    public void sendMsg() {
        System.out.println("华为手机发短信");
    }
    
}

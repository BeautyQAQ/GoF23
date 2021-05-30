package com.design.pattern.factory.abstraction;

public class XiaomiRouter implements IRouterProduce {

    @Override
    public void openWifi() {
        System.out.println("小米路由器开启WiFi");        
    }

    @Override
    public void startUp() {
        System.out.println("小米路由器开机");
    }
    
}

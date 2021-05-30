package com.design.pattern.factory.abstraction;

public class HuaweiRouter implements IRouterProduce {

    @Override
    public void openWifi() {
        System.out.println("华为路由器开启WiFi");        
    }

    @Override
    public void startUp() {
        System.out.println("华为路由器开机");
    }
    
}

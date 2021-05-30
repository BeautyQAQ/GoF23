package com.design.pattern.factory.abstraction;

public class Client {

    public static void main(String[] args) {
        XiaomiProduceFactory xiaomiProduceFactory = new XiaomiProduceFactory();
        HuaweiProduceFactory huaweiProduceFactory = new HuaweiProduceFactory();
        IPhoneProduce xiaomi = xiaomiProduceFactory.createPhone();
        IPhoneProduce huawei = huaweiProduceFactory.createPhone();

        IRouterProduce huaweiRouter = huaweiProduceFactory.createRouter();
        IRouterProduce xiaomiRouter = xiaomiProduceFactory.createRouter();

        xiaomi.call();
        huawei.call();
        xiaomiRouter.openWifi();
        huaweiRouter.openWifi();

    }
    
}

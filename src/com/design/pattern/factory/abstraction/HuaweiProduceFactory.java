package com.design.pattern.factory.abstraction;

/**
 * 华为产品工厂,生产华为设备
 */
public class HuaweiProduceFactory implements IProduceFactory {

    @Override
    public IPhoneProduce createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduce createRouter() {
        return new HuaweiRouter();
    }
    
}

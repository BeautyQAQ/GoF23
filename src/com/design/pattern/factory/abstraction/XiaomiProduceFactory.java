package com.design.pattern.factory.abstraction;

/**
 * 小米工厂,生产小米设备
 */
public class XiaomiProduceFactory implements IProduceFactory {

    @Override
    public IPhoneProduce createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduce createRouter() {
        return new XiaomiRouter();
    }
    
}

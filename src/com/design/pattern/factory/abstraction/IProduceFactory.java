package com.design.pattern.factory.abstraction;

/**
 * 产品工厂
 */
public interface IProduceFactory {
    /**
     * 生产手机
     */
    IPhoneProduce createPhone();

    /**
     * 生产路由器
     */
    IRouterProduce createRouter();
}

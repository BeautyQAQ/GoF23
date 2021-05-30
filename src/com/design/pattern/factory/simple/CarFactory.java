package com.design.pattern.factory.simple;

/**
 * 静态/简单工厂
 */
public class CarFactory {
    public static Car getCar(String car){
        if("五菱".equals(car)){
            return new WuLing();
        }else if("特斯拉".equals(car)){
            return new Tesla();
        }else{
            return null;
        }
    }
}

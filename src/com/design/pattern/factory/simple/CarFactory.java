package com.design.pattern.factory.simple;

/**
 * 静态/简单工厂
 * 如果要拓展新的汽车类型,那么还是需要对原有代码有侵入式修改,不符合开闭原则
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

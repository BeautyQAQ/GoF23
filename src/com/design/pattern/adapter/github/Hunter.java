package com.design.pattern.adapter.github;

/**
 * 猎人
 * 猎人狩猎任何`Lion`接口的实现
 */
public class Hunter {
    public void hunt(Lion lion){
        lion.roar();
        System.out.println("猎人狩猎");
    }
}

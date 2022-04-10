package com.design.pattern.facade.github;

public class Computer {

    /**
     * 开启电源
     */
    public void getElectricShock(){
        System.out.println("Ouch!");
    }

    /**
     * 发出声音
     */
    public void makeSound(){
        System.out.println("Beep beep!");
    }

    /**
     * 显示loading场景
     */
    public void showLoadingScreen(){
        System.out.println("Loading。。。");
    }

    /**
     * 可以使用了
     */
    public void bam(){
        System.out.println("Ready to be use!");
    }

    /**
     * 关闭
     */
    public void closeEverything(){
        System.out.println("Bup bup bup buzz's!");
    }

    /**
     * 确认关闭
     */
    public void sooth(){
        System.out.println("Zzzzz");
    }

    /**
     * 关电闸
     */
    public void pullCurrent(){
        System.out.println("Ha ha!");
    }
}

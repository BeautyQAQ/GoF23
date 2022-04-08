package com.design.pattern.factory.abstraction.github;

/**
 * 现在我们有抽象工厂，让我们制作相关对象的家庭，
 * 即木门工厂将创建一个木门和木门装配专家，
 * 铁门工厂将创建一个铁门和铁门装配专家
 */
public interface DoorFactory {
    Door makeDoor();
    DoorFittingExpert makeFittingExpert();
}

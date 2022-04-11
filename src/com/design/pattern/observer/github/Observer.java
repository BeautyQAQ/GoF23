package com.design.pattern.observer.github;


/**
 * 观察者
 */
public abstract class Observer{
    protected Subject subject;

    public abstract void update();
}

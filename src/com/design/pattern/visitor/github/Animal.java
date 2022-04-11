package com.design.pattern.visitor.github;

/**
 * 访问
 */
public interface Animal {
    public void accept(AnimalOperation operation);
}

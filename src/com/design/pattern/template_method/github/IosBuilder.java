package com.design.pattern.template_method.github;

public class IosBuilder extends Builder {

    @Override
    public void test() {
        System.out.println("Running ios tests");
    }

    @Override
    public void lint() {
        System.out.println("Linting the ios code");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble the ios build");
    }

    @Override
    public void deploy() {
        System.out.println("deploying ios build to server");
    }
    
}

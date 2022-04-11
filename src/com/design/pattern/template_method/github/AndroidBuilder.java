package com.design.pattern.template_method.github;

public class AndroidBuilder extends Builder {

    @Override
    public void test() {
        System.out.println("Running android tests");
    }

    @Override
    public void lint() {
        System.out.println("Linting the android code");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble the android build");
    }

    @Override
    public void deploy() {
        System.out.println("deploying android build to server");
    }

}

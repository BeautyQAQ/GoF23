package com.design.pattern.singleton.github;

public class President {

    private static President instance;

    private President() {
    }

    public static President getInstance() {
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }
}

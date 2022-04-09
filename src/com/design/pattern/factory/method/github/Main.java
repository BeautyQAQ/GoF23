package com.design.pattern.factory.method.github;

public class Main {
    public static void main(String[] args) {
        MarketingManager marketingManager = new MarketingManager();
        DevelopmentManager developmentManager = new DevelopmentManager();
        marketingManager.takeInterview();
        developmentManager.takeInterview();
    }
}

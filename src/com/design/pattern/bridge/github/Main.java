package com.design.pattern.bridge.github;

public class Main {
    public static void main(String[] args) {
        // 页面桥接主题
        DarkTheme darkTheme = new DarkTheme();
        About about = new About(darkTheme);
        Careers careers = new Careers(darkTheme);
        System.out.println(about.getContent());
        System.out.println(careers.getContent());

        LightTheme lightTheme = new LightTheme();
        Careers careers1 = new Careers(lightTheme);
        System.out.println(careers1.getContent());
    }
}

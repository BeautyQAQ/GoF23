package com.design.pattern.bridge.github;

/**
 * 页面
 */
public class Careers implements WebPage {

    protected Theme theme;

    public Careers(Theme theme){
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Careers page is in " + theme.getColor();
    }
}

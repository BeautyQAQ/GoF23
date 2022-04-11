package com.design.pattern.state.github;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new DefaultText());
        editor.type("First Line");

        editor.setState(new UpperCase());
        editor.type("Second line");
        editor.type("Third line");

        editor.setState(new LowerCase());
        editor.type("Four line");
        editor.type("Fifth line");
    }
}

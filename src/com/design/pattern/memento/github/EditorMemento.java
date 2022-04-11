package com.design.pattern.memento.github;

/**
 * 首先，我们有 memento 对象，可以保存编辑器状态
 */
public class EditorMemento {
    private String content;

    public EditorMemento(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}

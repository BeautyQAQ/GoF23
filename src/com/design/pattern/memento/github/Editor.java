package com.design.pattern.memento.github;

/**
 * 然后我们有将使用 memento 对象的编辑器，即发起者
 */
public class Editor {
    private String content;
    
    public void type(String works){
        this.content = this.content+works;
    }

    public String getContent(){
        return this.content;
    }

    public EditorMemento save(){
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento memento){
        this.content = memento.getContent();
    }
}

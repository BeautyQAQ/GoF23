package com.design.pattern.mediator.github;

/**
 * 用户，即同事
 */
public class User {
    private String name;
    private ChatRoomMediator chatMediator;

    public User(String name, ChatRoomMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName(){
        return this.name;
    }

    public void send(String message){
        this.chatMediator.showMessage(this, message);
    }
}

package com.design.pattern.mediator.github;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoom implements ChatRoomMediator {

    @Override
    public void showMessage(User user, String message) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        String name = user.getName();
        System.out.println(date+" [ "+name+" ]："+message);
    }
    
}

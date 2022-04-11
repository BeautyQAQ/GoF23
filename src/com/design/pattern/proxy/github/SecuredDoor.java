package com.design.pattern.proxy.github;

public class SecuredDoor {
    private Door door;

    public SecuredDoor(Door door){
        this.door = door;
    }

    public void open(String password){
        if (this.authenticate(password)) {
            this.door.open();
        }else{
            System.out.println("Bid no! It ain't possible.");
        }
    }

    public boolean authenticate(String password){
        return "12345".equals(password);
    }

    public void close(){
        this.door.close();
    }
}

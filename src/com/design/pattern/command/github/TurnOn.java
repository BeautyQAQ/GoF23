package com.design.pattern.command.github;

public class TurnOn implements Command {

    public Bulb bulb;

    public TurnOn(Bulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOn();
    }

    @Override
    public void undo() {
        this.bulb.turnOff();        
    }

    @Override
    public void redo() {
        this.execute();
    }
    
}


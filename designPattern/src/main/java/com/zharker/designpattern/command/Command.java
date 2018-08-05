package com.zharker.designpattern.command;

public abstract class Command {
    private Receiver receiver;

    public Command() {}

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    protected Object execute(Object[] args){
        return this.receiver.action(args);
    }

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
}

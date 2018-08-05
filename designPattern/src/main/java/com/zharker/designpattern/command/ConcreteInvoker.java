package com.zharker.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class ConcreteInvoker {

    private List<Command> commands;

    public ConcreteInvoker() {
        this.commands = new ArrayList<>();
    }

    public ConcreteInvoker(List<Command> commands) {
        this.commands = commands;
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void removeCommand(Command command){
       this.commands.remove(command);
    }

    public Object execute(Command command, Object... args){
        Object result = null;
        if(this.commands.contains(command)){
            result = command.execute(args);
        }
        return result;
    }
}

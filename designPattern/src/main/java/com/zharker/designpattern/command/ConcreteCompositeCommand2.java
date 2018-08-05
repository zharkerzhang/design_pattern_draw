package com.zharker.designpattern.command;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class ConcreteCompositeCommand2 extends Command {

    private List<Command> commandList;

    public ConcreteCompositeCommand2(Receiver receiver) {
        super(receiver);
    }

    public ConcreteCompositeCommand2(Receiver receiver, Command... commands) {
        super(receiver);
        this.commandList = new LinkedList<>();
        Arrays.stream(commands).forEach(c->c.setReceiver(receiver));
        this.commandList.addAll(Arrays.stream(commands).collect(Collectors.toList()));
    }

    @Override
    protected Object execute(Object[] args) {
        if(commandList == null || commandList.size() == 0){
            return super.execute(args);
        }
        System.out.println(this.getClass().getSimpleName()+" instance do composite: ");
        Object result = null;
        return this.commandList.stream()
                .map(c->{
                    System.out.println("\r\n"+c.getClass().getSimpleName()+" instance called by "+this.getClass().getSimpleName()+" instance");
                    return c.execute(args);
                })
//                .skip(commandList.size()-1)
//                .findFirst()
//                .orElse(null);
                .collect(Collectors.toList()).get(commandList.size()-1);
    }
}

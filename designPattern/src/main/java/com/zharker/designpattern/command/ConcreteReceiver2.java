package com.zharker.designpattern.command;

import java.util.Arrays;

public class ConcreteReceiver2 implements Receiver {
    @Override
    public Object action(Object... args) {
        System.out.println(this.getClass().getSimpleName()+" instance action: ");
        if(args==null|| args.length==0){
            return new Object();
        }
        Arrays.stream(args).forEach(System.out::print);
        return args[0];
    }
}

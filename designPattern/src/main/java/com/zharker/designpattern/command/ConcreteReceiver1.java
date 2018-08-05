package com.zharker.designpattern.command;

import java.util.Arrays;

public class ConcreteReceiver1 implements Receiver {
    @Override
    public Object action(Object... args) {
        System.out.println(this.getClass().getSimpleName()+" instance action: ");
        Arrays.stream(args).forEach(System.out::print);
        return args.length;
    }
}

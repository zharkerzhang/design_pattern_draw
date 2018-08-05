package com.zharker.designpattern.mediator;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcreteMediator extends Mediator {


    public Object handle(String name, String method, Object[] args) {
        Colleague c = this.getColleagueMap().get(name);
        Object result = null;
        try {
            result = c.getClass()
                .getMethod(method, Arrays.stream(args).map(Object::getClass).toArray(s->new Class[s]))
                .invoke(c, args);
        } catch (IllegalAccessException|InvocationTargetException|NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }
}

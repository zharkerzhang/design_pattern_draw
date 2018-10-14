package com.zharker.designpattern;

import com.zharker.designpattern.visitor.*;
import com.zharker.designpattern.visitor.act.Actor;
import com.zharker.designpattern.visitor.act.NewRole;
import com.zharker.designpattern.visitor.act.OldRole;
import com.zharker.designpattern.visitor.act.Role;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VisitorTest {

    @Test
    public void visitorTest(){

        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<Element> elements = Stream.generate(()->{

            double randomm = Math.random();

            String state = String.valueOf(Math.round(randomm));

            return randomm > 0.5 ?
                    new ConcreteElement1("element1:{"+atomicInteger.getAndIncrement()+"}",state) :
                    new ConcreteElement2("element2:{"+atomicInteger.getAndIncrement()+"}",state);

        }).limit(10).collect(Collectors.toCollection(ArrayList::new));

        Visitor visitor = new ConcreteVisitor();
        elements.forEach(e->{
            e.accept(visitor);
        });
        if(visitor instanceof ConcreteVisitor){
            System.out.println("element1Percent:"+((ConcreteVisitor)visitor).getElement1Percent());
        }

    }


    @Test
    public void actTest(){
        Actor actor = new Actor() {
        };
        Role newRole = new NewRole();
        actor.act(newRole);
        actor.act(new OldRole());

        newRole.accept(actor);


    }
}

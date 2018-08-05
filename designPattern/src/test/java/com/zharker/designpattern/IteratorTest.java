package com.zharker.designpattern;

import com.zharker.designpattern.iterator.Aggregate;
import com.zharker.designpattern.iterator.ConcreteAggrergate;
import com.zharker.designpattern.iterator.Iterator;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void iteratorTest(){
        Aggregate aggregate = new ConcreteAggrergate();
        aggregate.add("2222");
        aggregate.add("233333");
        aggregate.add(5555);
        aggregate.add("sb");


        Iterator iterator = aggregate.iterator();

        while (iterator.hasNext(Iterator.ASC)){
            System.out.println("current: "+iterator.current());
            Object object = iterator.next(Iterator.ASC);
            System.out.println("asc: "+object);
        }

        System.out.println("current: "+iterator.current());

        System.out.println("\r\nclone iterator:");
        iterator = ((Aggregate)aggregate.clone()).iterator();

        while (iterator.hasNext(Iterator.DESC)){
            Object object = iterator.next(Iterator.DESC);
            System.out.println("desc: "+object);
            System.out.println("current: "+iterator.current());
        }

        System.out.println("first: "+iterator.first());
        System.out.println("last: "+iterator.last());

    }
}

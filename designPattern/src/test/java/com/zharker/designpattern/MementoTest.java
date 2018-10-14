package com.zharker.designpattern;

import com.zharker.designpattern.memento.CheckPointCaretaker;
import com.zharker.designpattern.memento.SingleMemento;
import com.zharker.designpattern.memento.Caretaker;
import com.zharker.designpattern.memento.origin.Originator;
import org.junit.Test;

public class MementoTest {

    @Test
    public void originMementoTest(){
        Originator originator = new Originator();
        originator.setState("hehe");
        Caretaker caretaker = new Caretaker();
        caretaker.setIMemento(originator.createMemento());
        System.out.println(originator.getState());
        originator.setState("diaodiaodiao");
        System.out.println(originator.getState());
        originator.storeMemento(caretaker.getIMemento());
        System.out.println(originator.getState());
    }

    @Test
    public void singleMementoTest(){
        SingleMemento singleMemento = new SingleMemento();
        singleMemento.setState("ai");
        singleMemento.createMemento();
        System.out.println(singleMemento.getState());
        singleMemento.setState("ai...");
        System.out.println(singleMemento.getState());
        singleMemento.storeMemento();
        System.out.println(singleMemento.getState());
    }

    @Test
    public void multiMementoTest(){
        com.zharker.designpattern.memento.multistate.Originator originator = new com.zharker.designpattern.memento.multistate.Originator();
        originator.setState1("s1");
        originator.setState2("s2");
        originator.setState3("s3");
        System.out.println(originator);
        Caretaker caretaker = new Caretaker();
        caretaker.setIMemento(originator.createMemento());
        originator.setState1("s11");
        originator.setState2("s22");
        originator.setState3("s33");
        System.out.println(originator);
        originator.storeMemento(caretaker.getIMemento());
        System.out.println(originator);
    }


    @Test
    public void checkPointMementoTest(){
        com.zharker.designpattern.memento.multistate.Originator originator = new com.zharker.designpattern.memento.multistate.Originator();
        CheckPointCaretaker caretaker = new CheckPointCaretaker();
        originator.setState1("s1");
        originator.setState2("s2");
        originator.setState3("s3");
        System.out.println(originator);
        caretaker.setIMemento("savepoint1",originator.createMemento());
        originator.setState1("s11");
        originator.setState2("s22");
        originator.setState3("s33");
        System.out.println(originator);
        caretaker.setIMemento("savepoint2",originator.createMemento());
        originator.setState1("s111");
        originator.setState2("s222");
        originator.setState3("s333");
        System.out.println(originator);
        caretaker.setIMemento("savepoint3",originator.createMemento());

        originator.storeMemento(caretaker.getIMemento("savepoint2"));
        System.out.println(originator);
        originator.storeMemento(caretaker.getIMemento("savepoint1"));
        System.out.println(originator);
        originator.storeMemento(caretaker.getIMemento("savepoint3"));
        System.out.println(originator);
    }
}

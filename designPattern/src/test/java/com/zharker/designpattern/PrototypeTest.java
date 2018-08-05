package com.zharker.designpattern;

import com.zharker.designpattern.prototype.Attribute;
import com.zharker.designpattern.prototype.ContretePrototype;
import com.zharker.designpattern.prototype.DeepClonePrototype;
import com.zharker.designpattern.prototype.Prototype;
import com.zharker.designpattern.prototype.ShallowClonePrototype;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void prototypeTest1(){
        Prototype p = new ContretePrototype("2333");
        Prototype cloneP = p.clone();
        System.out.println(cloneP);
        p.setAttribute("5555555");
        System.out.println(cloneP);
    }

    @Test
    public void prototypeTest2(){
        Attribute a = new Attribute("attr_key","attr_value");
        Prototype p = new ShallowClonePrototype(a);
        Prototype cloneP = p.clone();
        System.out.println(cloneP);
        a.setName("new_attr_key");
        a.setValue("new_attr_value");
        System.out.println(cloneP);
    }

    @Test
    public void prototypeTest3(){
        Attribute a = new Attribute("attr_key","attr_value");
        Prototype p = new DeepClonePrototype(a);
        Prototype cloneP = p.clone();
        System.out.println(cloneP);
        a.setName("new_attr_key");
        a.setValue("new_attr_value");
        System.out.println(cloneP);
    }
}

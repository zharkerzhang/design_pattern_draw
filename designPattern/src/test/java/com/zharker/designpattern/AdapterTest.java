package com.zharker.designpattern;

import com.zharker.designpattern.adapter.Adapter;
import com.zharker.designpattern.adapter.ConcreteTarget;
import com.zharker.designpattern.adapter.ObjectAdapter;
import com.zharker.designpattern.adapter.Target;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void adapterTest1(){

        Target target = new ConcreteTarget();
        target.request();

        target = new Adapter();
        target.request();

    }

    @Test
    public void adapterTest2(){
        Target target = new ConcreteTarget();
        target.request();

        target = new ObjectAdapter();
        target.request();
    }
}

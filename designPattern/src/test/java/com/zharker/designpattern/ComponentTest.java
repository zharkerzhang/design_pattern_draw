package com.zharker.designpattern;

import com.zharker.designpattern.component.securityimplement.Component;
import com.zharker.designpattern.component.securityimplement.Composite;
import com.zharker.designpattern.component.securityimplement.Leaf;
import org.junit.Test;

public class ComponentTest {

    @Test
    public void securityComponentTest(){
        Composite root = new Composite();
        root.doSomething("root");

        Component root_left_leaf = new Leaf();
        root_left_leaf.doSomething("root_left_leaf");
        root.add(root_left_leaf);

        Composite root_right_composite = new Composite();
        root_right_composite.doSomething("root_right_composite");
        root.add(root_right_composite);

        Component root_right_composite_left_leaf = new Leaf();
        root_right_composite_left_leaf.doSomething("root_right_composite_left_leaf");
        root_right_composite.add(root_right_composite_left_leaf);

        Component root_right_composite_right_leaf = new Leaf();
        root_right_composite_left_leaf.doSomething("root_right_composite_right_leaf");
        root_right_composite.add(root_right_composite_left_leaf);

        System.out.println(root.toString());

    }

    @Test
    public void transparentComponentTest(){
        com.zharker.designpattern.component.transparentimplement.Component root =
            new com.zharker.designpattern.component.transparentimplement.Composite("root",null);

        com.zharker.designpattern.component.transparentimplement.Component child1 =
            new com.zharker.designpattern.component.transparentimplement.Composite("child1",root);

        com.zharker.designpattern.component.transparentimplement.Component child11 =
            new com.zharker.designpattern.component.transparentimplement.Composite("child11",child1);

        com.zharker.designpattern.component.transparentimplement.Component child111 =
            new com.zharker.designpattern.component.transparentimplement.Leaf("child111",child11);

        com.zharker.designpattern.component.transparentimplement.Component child12 =
            new com.zharker.designpattern.component.transparentimplement.Leaf("child12",child1);

        com.zharker.designpattern.component.transparentimplement.Component child2 =
            new com.zharker.designpattern.component.transparentimplement.Leaf("child2",root);


        System.out.println("child11 parent: "+child11.getPartner().getName());

        System.out.println(root);


    }
}

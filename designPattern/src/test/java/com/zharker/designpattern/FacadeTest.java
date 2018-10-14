package com.zharker.designpattern;

import com.zharker.designpattern.facade.Facade;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void facadeTest(){
        Facade facade = new Facade();
        System.out.println(facade.three(2333));
        facade.two();
        facade.one();

    }
}

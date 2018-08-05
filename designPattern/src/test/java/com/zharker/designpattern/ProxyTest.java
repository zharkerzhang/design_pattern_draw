package com.zharker.designpattern;

import com.zharker.designpattern.proxy.*;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void proxyTest1(){
        Subject s = new ContreteSubject();
        Subject p = new StaticProxy(s);

        p.doSomething();

    }

    @Test
    public void proxyTest2(){
        Subject s = new ContreteSubject();
        Subject p = (Subject)new JDKDynamicProxy(s).getProxyInstance();

        p.doSomething();
    }

    @Test
    public void proxyTest3(){
        Subject s = new ContreteSubject();
        Subject p = (Subject)new CglibDynamicProxy(s).getProxyInstance();

        p.doSomething();
    }
}

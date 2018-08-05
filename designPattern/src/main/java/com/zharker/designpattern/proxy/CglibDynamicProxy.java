package com.zharker.designpattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy extends AbstractProxy{

    private Enhancer enhancer;
    private Object target;

    public CglibDynamicProxy(Object target) {
        enhancer = new Enhancer();
        this.target = target;
    }

    public Object getProxyInstance(){

        enhancer.setSuperclass(target.getClass());

        enhancer.setCallback(new MethodInterceptor(){
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                before();
                Object result = method.invoke(target,objects);
                after();
                return result;

            }
        });

        return enhancer.create();

    }


    public void after() {
        System.out.println("CglibDynamicProxy instance proxy do after target done");
    }

    public void before() {
        System.out.println("CglibDynamicProxy instance proxy do before target do");
    }
}

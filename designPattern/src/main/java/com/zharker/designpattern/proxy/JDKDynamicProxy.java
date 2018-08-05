package com.zharker.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy extends AbstractProxy{
    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        before();
                        Object result = method.invoke(target,args);
                        after();
                        return result;
                    }
                });
    }

    public void after() {
        System.out.println("proxy do after target done");
    }

    public void before() {
        System.out.println("proxy do before target do");
    }
}

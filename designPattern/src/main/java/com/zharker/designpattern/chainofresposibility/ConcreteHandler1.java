package com.zharker.designpattern.chainofresposibility;

public class ConcreteHandler1 extends Handler {

    private Level handleLevel;

    public ConcreteHandler1(Level handleLevel){
        this.handleLevel = handleLevel;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("ConcreteHandler1 instance echo");
        return new Response("response_"+request.getRequestLevel());
    }

    @Override
    protected Level getHandlerLevel() {
        return this.handleLevel;
    }
}

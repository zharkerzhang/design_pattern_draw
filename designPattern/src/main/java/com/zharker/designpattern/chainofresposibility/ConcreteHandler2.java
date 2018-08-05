package com.zharker.designpattern.chainofresposibility;

public class ConcreteHandler2 extends Handler {

    private Level handleLevel;

    public ConcreteHandler2(Level handleLevel){
        this.handleLevel = handleLevel;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("ConcreteHandler2 instance echo");
        return new Response("response_"+request.getRequestLevel());
    }

    @Override
    protected Level getHandlerLevel() {
        return this.handleLevel;
    }
}

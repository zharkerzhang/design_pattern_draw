package com.zharker.designpattern.chainofresposibility;

public class ConcreteHandler3 extends Handler {

    private Level handleLevel;

    public ConcreteHandler3(Level handleLevel){
        this.handleLevel = handleLevel;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("ConcreteHandler3 instance echo");
        return new Response("response_"+request.getRequestLevel());
    }

    @Override
    protected Level getHandlerLevel() {
        return this.handleLevel;
    }
}

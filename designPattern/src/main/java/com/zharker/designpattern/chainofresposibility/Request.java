package com.zharker.designpattern.chainofresposibility;

public class Request {

    private final Level level;

    public Request(Level level){
        this.level = level;
    }

    public Level getRequestLevel() {
        return this.level;
    }

}

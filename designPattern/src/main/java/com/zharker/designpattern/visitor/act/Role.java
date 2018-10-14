package com.zharker.designpattern.visitor.act;

public abstract class Role {

    public void accept(Actor actor){
        actor.act(this);
    }
}

package com.zharker.designpattern.visitor.act;

public class NewRole extends Role {
    public void accept(Actor actor){
        actor.act(this);
    }
}

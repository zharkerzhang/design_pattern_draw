package com.zharker.designpattern.visitor.act;

public class OldRole extends Role {
    public void accept(Actor actor){
        actor.act(this);
    }
}

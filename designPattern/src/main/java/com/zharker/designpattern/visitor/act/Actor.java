package com.zharker.designpattern.visitor.act;

public abstract class Actor {

    public void act(Role role){
        System.out.println("actor: "+this.getClass().getSimpleName()+" act every role");
    }

    public void act(NewRole newRole){
        System.out.println("actor: "+this.getClass().getSimpleName()+" act new role");
    }

    public void act(OldRole oldRole){
        System.out.println("actor: "+this.getClass().getSimpleName()+" act old role");
    }

}

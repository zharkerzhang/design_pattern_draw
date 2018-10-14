package com.zharker.designpattern.bridge;

public abstract class Abstraction {

    private Implemetor implemetor;

    public Abstraction(Implemetor implemetor) {
        this.implemetor = implemetor;
    }

    protected abstract void dohandle1();
    protected abstract void dohandle2();

    public void handle(){
        dohandle1();
        dohandle2();
    }

    public Implemetor getImplemetor() {
        return implemetor;
    }

    public void setImplemetor(Implemetor implemetor) {
        this.implemetor = implemetor;
    }
}

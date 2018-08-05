package com.zharker.designpattern.component.transparentimplement;

import java.util.List;

public abstract class Component {
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract List<Component> getChildren();
    public abstract Component getPartner();
    public Component(String name){this.name = name;};
    private String name;
    public String getName(){return name;};

}

package com.zharker.designpattern.component.transparentimplement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Composite extends Component {

    private Component parent = null;
    private List<Component> children = new ArrayList<>(10);

    public Composite(String name, Component parent) {
        super(name);
        this.parent = parent;
        if(parent != null){
            parent.add(this);
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }

    @Override
    public Component getPartner() {
        return parent;
    }

    @Override
    public String toString() {
        return
                this.getClass().getSimpleName()+": "+super.getName()+",\r\n children: "+
                        this.children.stream().map(c->c.toString()).collect(Collectors.joining(","));
    }
}

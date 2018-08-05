package com.zharker.designpattern.component.transparentimplement;

import java.util.List;

public class Leaf extends Component {
    private Component parent;
    @Override
    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Component> getChildren() {
        throw new UnsupportedOperationException();
    }

    public Leaf(String name, Component parent) {
        super(name);
        this.parent = parent;
        this.parent.add(this);
    }

    @Override
    public Component getPartner() {
        return parent;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": "+super.getName();
    }
}

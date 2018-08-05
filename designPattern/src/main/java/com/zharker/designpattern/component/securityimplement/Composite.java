package com.zharker.designpattern.component.securityimplement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Composite extends Component {

    private List<Component> componentList = new ArrayList<>();

    public void add(Component component){
        this.componentList.add(component);
    }

    public void remove(Component component){
        this.componentList.remove(component);
    }

    public List<Component> getChildren(){
        return this.componentList;
    }

    @Override
    public void doSomething(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return
        this.getClass().getSimpleName()+": "+super.getName()+",\r\n children: "+
        this.componentList.stream().map(c->c.toString()).collect(Collectors.joining(","));
    }
}

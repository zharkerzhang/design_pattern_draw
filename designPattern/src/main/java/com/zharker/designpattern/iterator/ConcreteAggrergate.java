package com.zharker.designpattern.iterator;

import java.util.Vector;

public class ConcreteAggrergate implements Aggregate<Object> {

    private Vector<Object> vector = new Vector<>();

    private void setVector(Vector<Object> vector){
        this.vector = vector;
    }

    @Override
    public void add(Object o) {
        vector.add(o);
    }

    @Override
    public void remove(Object o) {
        vector.remove(o);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }

    @Override
    public Object clone(){
        Object result = null;
        try {
            result = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ((ConcreteAggrergate)result).setVector((Vector<Object>)vector.clone());
        return result;
    }
}

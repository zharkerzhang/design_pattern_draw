package com.zharker.designpattern.iterator;

import java.util.Vector;

public class ConcreteIterator implements Iterator<Object> {

    private int cursor = 0;
    private Vector<Object> vector;

    public ConcreteIterator(Vector<Object> vector) {
        this.vector = vector;
    }

    @Override
    public Object next(boolean isASC) {
        if(hasNext(isASC)){
            Object result = vector.get(cursor);
            cursor = isASC?cursor+1:cursor-1;
            return result;
        }
        return null;
    }

    @Override
    public boolean hasNext(boolean isASC) {
        if(cursor==-1||cursor==vector.size()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object first() {
        return vector.get(0);
    }

    @Override
    public Object last() {
        return vector.get(vector.size()-1);
    }

    @Override
    public Object current() {
        if(hasNext(Iterator.ASC) && hasNext(Iterator.DESC)){
            return vector.get(cursor);
        }else{
            return null;
        }
    }
}

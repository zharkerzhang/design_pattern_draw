package com.zharker.designpattern.iterator;

public interface Aggregate<T> extends Cloneable {

    public void add(T t);

    public void remove(T t);

    public Iterator iterator();

    public Object clone();
}

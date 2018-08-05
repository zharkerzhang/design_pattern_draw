package com.zharker.designpattern.iterator;

public interface Iterator<T extends Object> {

    public final static boolean ASC = true;
    public final static boolean DESC = false;

    public T next(boolean isASC);

    public boolean hasNext(boolean isASC);

    public T first();

    public T last();

    public T current();

}

package com.zharker.designpattern.command;

public interface Receiver {
    Object action(Object... args);
}

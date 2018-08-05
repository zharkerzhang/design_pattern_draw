package com.zharker.designpattern.chainofresposibility;

public class Level {

    private final int level;

    public Level(int level){
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Level level1 = (Level) o;

        return level == level1.level;
    }

    @Override
    public int hashCode() {
        return level;
    }
}

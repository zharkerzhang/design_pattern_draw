package com.zharker.designpattern.strategy;

public enum StrategyEnum {

    STRATEGY_1("1"){
        @Override
        public void doSomething() {
         System.out.println(this+" enum doSomething");
        }
    },
    STRATEGY_2("2"){
        @Override
        public void doSomething() {
            System.out.println(this+" enum doSomething");
        }
    };

    String operate="";

    StrategyEnum(String operate) {
        this.operate = operate;
    }

    public abstract void doSomething();
}

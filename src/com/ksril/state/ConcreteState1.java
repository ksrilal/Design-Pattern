package com.ksril.state;

public class ConcreteState1 implements State{
    @Override
    public void handle1() {
        System.out.println("ConcreteState1 -> handle1");
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteState1 -> handle2");
    }
}

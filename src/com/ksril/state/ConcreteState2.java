package com.ksril.state;

public class ConcreteState2 implements State{
    @Override
    public void handle1() {
        System.out.println("ConcreteState2 -> handle1");
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteState2 -> handle2");
    }
}

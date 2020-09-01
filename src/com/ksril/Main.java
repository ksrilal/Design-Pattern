package com.ksril;

import com.ksril.memento.CareTaker;
import com.ksril.memento.Originator;
import com.ksril.state.ConcreteState1;
import com.ksril.state.Context;

public class Main {
    public static void main(String[] args) {

        //memento demo ---->>>>
        /*
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setContent("A");
        careTaker.push(originator.createMemento());

        originator.setContent("B");
        careTaker.push(originator.createMemento());

        originator.setContent("C");

        originator.restore(careTaker.pop());
        originator.restore(careTaker.pop());

        System.out.println(originator.getContent());
         */
        //<<<<----

        
        //state demo ---->>>>

        Context context = new Context();
        context.setCurrentState(new ConcreteState1()); //or ConcreteState2
        context.handle1();
        context.handle2();

        //<<<<----
    }
}

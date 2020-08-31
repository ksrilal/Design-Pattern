package com.ksril;

import com.ksril.memento.CareTaker;
import com.ksril.memento.Originator;

public class Main {
    public static void main(String[] args) {
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
    }
}

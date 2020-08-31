package com.ksril.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoes = new ArrayList<>();

    public void push(Memento memento) {
        mementoes.add(memento);
    }

    public Memento pop() {
        int lastIndex = mementoes.size() - 1;
        Memento lastMemento = mementoes.get(lastIndex);
        mementoes.remove(lastMemento);

        return lastMemento;
    }
}

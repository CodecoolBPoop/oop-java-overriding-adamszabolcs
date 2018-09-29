package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    public Orderable process() {
        stepBefore();
        action();
        stepAfter();
    }

    public void stepBefore() {

    }

    protected Orderable action() {

    }

    public void stepAfter() {

    }
}

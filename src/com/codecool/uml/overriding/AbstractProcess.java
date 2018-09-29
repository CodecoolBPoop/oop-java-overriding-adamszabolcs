package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    public void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }

    public void stepBefore() {
        System.out.println("This is the step before");
    }

    protected abstract void action(Orderable item);

    public void stepAfter() {
        System.out.println("This is the step after");

    }
}

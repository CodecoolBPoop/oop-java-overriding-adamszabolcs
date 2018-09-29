package com.codecool.uml.overriding;

public class Order implements Orderable {

    private int id;
    private static int counter = 1;
    private String status;

    public Order() {
        this.id = counter++;
    }

    public String getStatus() {
        return status;
    }

    public boolean checkout() {
        this.status = "Checkout";
    }

    public boolean pay() {
        this.status = "Pay";
    }
}

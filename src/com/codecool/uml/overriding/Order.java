package com.codecool.uml.overriding;

public class Order implements Orderable {

    private int id;
    private static int counter = 1;
    private String status;

    public Order() {
        this.id = counter++;
        this.status = "New";
    }

    public String getStatus() {
        return status;
    }

    public boolean checkout() {
        if (getStatus().equals("New")) {
            this.status = "Checkout";
            return true;
        }
        return false;
    }


    public boolean pay() {
        if (getStatus().equals("Checkout")) {
            this.status = "Pay";
            return true;
        }
        return false;
    }
}

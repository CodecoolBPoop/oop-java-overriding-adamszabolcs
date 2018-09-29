package com.codecool.uml.overriding;

public class Order implements Orderable {

    private int id;
    private String status;

    public String getStatus() {
        return status;
    }

    public boolean checkout() {
        //TODO
    }

    public boolean pay() {
        //TODO
    }
}

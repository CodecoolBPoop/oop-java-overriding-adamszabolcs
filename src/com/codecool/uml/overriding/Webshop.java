package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        Order order = new Order();
        CheckoutProcess checkOut = new CheckoutProcess();
        checkOut.process(order);
        PaymentProcess payment = new PaymentProcess();
        payment.process(order);
    }
}

package com.learning.learning;

public class StripePaymentService implements PaymentServices{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment");
        System.out.println("Amount: " + amount);
    }
}

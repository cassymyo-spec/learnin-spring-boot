package com.learning.learning;

public class OrderService {
    public void placeOrder() {
        System.out.println("Order placed");
        var paymentService = new StripePaymentService();
        paymentService.processPayment(100);
    }
}
    
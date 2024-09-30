package org.example.design_patterns.adapter;

public class OldPaymentApi {
    public boolean processPayment(double amount, String Cardnumber){
        System.out.println("Payment successful with old api");
        return true;
    }
}

package org.example.design_patterns.facade;

import java.util.Collection;

public class PaymentService {
    public void processPayment(Collection<Object> paymentDetails) {
        System.out.println("successfully paid for ordered goods");
    }
}

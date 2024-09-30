package org.example.design_patterns.adapter;

public class Application {
    public static void main(String[] args) {
        //Create new payment request
        PaymentRequest paymentRequest = new PaymentRequest(0.0, "g7ew73hy23");

        //Create Payment api
        OldPaymentApi api = new OldPaymentApi();

        //Create payment adaptor
        LegacyPaymentProcessorAdapter processor = new LegacyPaymentProcessorAdapter(api);

        //Make payment
        processor.processPayment(paymentRequest);
    }
}

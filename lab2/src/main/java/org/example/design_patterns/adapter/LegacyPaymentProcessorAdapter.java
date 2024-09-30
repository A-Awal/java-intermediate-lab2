package org.example.design_patterns.adapter;

public class LegacyPaymentProcessorAdapter  {

    private OldPaymentApi legacyPaymentLibrary;

    public LegacyPaymentProcessorAdapter(OldPaymentApi legacyPaymentLibrary) {
        this.legacyPaymentLibrary = legacyPaymentLibrary;
    }

    public boolean processPayment(PaymentRequest request) {
        // Convert PaymentRequest to legacy library format
        double amount = request.amount();
        String cardNumber = request.CardNumber();

        // Call legacy library method
        boolean result = legacyPaymentLibrary.processPayment(amount, cardNumber);

        return result;
    }
}

package org.example.design_patterns.facade;

public class OrderFacade {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private CustomerService customerService;

    public OrderFacade(InventoryService inventoryService, PaymentService paymentService, ShippingService shippingService, CustomerService customerService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
        this.customerService = customerService;
    }

    public Order placeOrder(Order order) {
        // Check inventory availability
        inventoryService.checkInventory(order.getItems());

        // Process payment
        paymentService.processPayment(order.getPaymentDetails());

        shippingService.createShipment(order);

        // Update customer order history
        customerService.addOrderToHistory(order);

        return order;
    }

}


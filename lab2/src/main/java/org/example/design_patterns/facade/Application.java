package org.example.design_patterns.facade;

public class Application {
    public static void main(String[] args) {

        //Create Order
        Order order = new Order();

        //Create customer service
        CustomerService customerService = new CustomerService();

        //Create Inventory service
        InventoryService inventoryService = new InventoryService();

        // Create Payment service
        PaymentService paymentService = new PaymentService();

        //Create Shipping Service
        ShippingService shippingService = new ShippingService();

        // Create Order facade
        OrderFacade orderFacade = new OrderFacade(inventoryService, paymentService, shippingService, customerService);

        //Process order
        orderFacade.placeOrder(order);
    }
}

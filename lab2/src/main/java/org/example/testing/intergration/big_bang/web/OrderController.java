package org.example.testing.intergration.big_bang.web;

import org.example.testing.intergration.big_bang.services.OrderService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/big-bang/orders")
@Profile("big_bang")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
}

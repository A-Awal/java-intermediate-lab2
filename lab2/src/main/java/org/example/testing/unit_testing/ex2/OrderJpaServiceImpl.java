package org.example.testing.unit_testing.ex2;

import org.example.testing.unit_testing.ex1.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("unit-testing-ex2")
public class OrderJpaServiceImpl {
    private final OrderJpaRepo _orderJpaRepo;

    @Autowired
    public OrderJpaServiceImpl(OrderJpaRepo orderJpaRepo) {
        _orderJpaRepo = orderJpaRepo;
    }

    public Orders addOrder(Orders orders) {
       return _orderJpaRepo.save(orders);
    }
}

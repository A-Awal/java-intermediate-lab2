package org.example.testing.unit_testing.ex1;

public class OrderServiceImpl implements OrderService {
    private final OrderRepository _orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        _orderRepository = orderRepository;
    }
    public boolean save(Orders orders){
        return _orderRepository.saveOrder(orders);
    }
}

package org.example.testing.intergration.big_bang.services;

import org.example.testing.intergration.big_bang.model.Customer;
import org.example.testing.intergration.big_bang.model.Purchases;
import org.example.testing.intergration.big_bang.repository.OrdersRepository;
import org.example.testing.intergration.common.BaseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("big_bang")
public class OrderService  extends BaseService<Purchases, Integer> {
    public OrderService(OrdersRepository repository) {
        super(repository);
    }
}

package org.example.testing.intergration.big_bang.services;

import org.example.testing.intergration.big_bang.model.Customer;
import org.example.testing.intergration.big_bang.repository.CustomerRepository;
import org.example.testing.intergration.common.BaseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("big_bang")
public class CustomerService extends BaseService<Customer, Integer> {
    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
    }
}

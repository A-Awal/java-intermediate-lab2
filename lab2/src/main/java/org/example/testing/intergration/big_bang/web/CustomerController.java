package org.example.testing.intergration.big_bang.web;

import org.example.testing.intergration.big_bang.exceptionHandling.ControllerException;
import org.example.testing.intergration.big_bang.model.Customer;
import org.example.testing.intergration.big_bang.services.CustomerService;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/big-bang/customers")
@Profile("big_bang")
public class CustomerController {
    private final CustomerService _customerService;

    public CustomerController(CustomerService customerService) {
       _customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<Optional<Customer>> getCustomers() {
        return  ResponseEntity.ok(_customerService.findOne(1));
    }

    @GetMapping("/error")
    public ResponseEntity<String> throwerror(){
        throw  new ControllerException("Controller advice error");
    }

}

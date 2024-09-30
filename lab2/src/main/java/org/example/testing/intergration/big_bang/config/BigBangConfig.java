package org.example.testing.intergration.big_bang.config;

import org.example.testing.intergration.big_bang.model.Customer;
import org.example.testing.intergration.big_bang.services.CustomerService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@Profile("big_bang")
public class BigBangConfig {

    @Bean
    public ApplicationListener<ApplicationReadyEvent> applicationListener(CustomerService evt){
        return (et) -> {
            evt.save(Customer.builder().name("John Doe").email("johndoe@example.com").build());
            evt.save(Customer.builder().name("Jane Smith").email("janesmith@example.com").build());
            evt.save(Customer.builder().name("Alice Johnson").email("alicejohnson@example.com").build());
        };

    }
}

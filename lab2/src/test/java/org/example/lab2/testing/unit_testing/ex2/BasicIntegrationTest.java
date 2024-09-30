package org.example.lab2.testing.unit_testing.ex2;
import static org.assertj.core.api.Assertions.assertThat;

import org.example.Configurations.AppConfig;
import org.example.testing.unit_testing.ex1.Orders;
import org.example.testing.unit_testing.ex2.OrderJpaServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
@ActiveProfiles({"unit-testing-ex2"})
public class BasicIntegrationTest {

    @Autowired
    private OrderJpaServiceImpl orderJpaService;

    @Test
    public void testOrderService() {
        //Arrange
        Orders orders = new Orders(23);

        //Act
        var s = orderJpaService.addOrder(orders);

        //Assert
        assertThat(orderJpaService).isNotNull();
        assertThat(s.getId()).isGreaterThan(0);

    }
}

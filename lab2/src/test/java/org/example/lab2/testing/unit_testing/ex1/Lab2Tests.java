package org.example.lab2.testing.unit_testing.ex1;

import org.example.testing.unit_testing.ex1.Orders;
import org.example.testing.unit_testing.ex1.OrderRepository;
import org.example.testing.unit_testing.ex1.OrderServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Lab2Tests {

    @Test
    void testGetUser() {
        //arrange
        OrderRepository repository = mock(OrderRepository.class);

        OrderServiceImpl service = new OrderServiceImpl(repository);
        Orders orders = new Orders( 38);

        //Act
        when(repository.saveOrder(orders)).thenReturn(true);

        //Assert
        assertThat(service.save(orders)).isTrue();

    }
}

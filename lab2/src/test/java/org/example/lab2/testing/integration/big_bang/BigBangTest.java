package org.example.lab2.testing.integration.big_bang;

import org.example.testing.intergration.big_bang.exceptionHandling.ControllerException;
import org.example.testing.intergration.big_bang.model.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("big_bang")
public class BigBangTest {

    public static final String ERROR = "/error";
    public static final String BIG_BANG_CUSTOMERS = "/big-bang/customers";
    @Value("${local.server.port}")
    String port;

    private final String BASE_URL = "http://localhost:";

    @Autowired
    private TestRestTemplate _restTemplate;

    @Test
    @DisplayName("Try get the first customer")
    public void get_CustumerBYId() {
       var res = _restTemplate.getForObject(BASE_URL + port + BIG_BANG_CUSTOMERS, String.class);
       assertThat(res).isNotNull();
    }

    @Test
    public void isControlleradviceWorking(){
        var res = _restTemplate.getForObject(BASE_URL + port + BIG_BANG_CUSTOMERS+ ERROR, String.class);
        assertThat(res).contains("Controller advice error");
    }
}

package org.example.lab2.testing.integration.topdown;

import org.example.testing.intergration.topdown.api.LibraryController;
import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("topdown")
public class ControllerAndSeviceIntegrated {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    BookRepository bookRepository;

    @Test
    void Test_Controller_And_Service() throws Exception {
        Book b1 = new Book();
        b1.setTitle("Java2");
        b1.setAuthor("Java2");
        b1.setQuantity(150l);

        when(bookRepository.findById(anyInt())).thenReturn(Optional.of(b1));

        mockMvc.perform(get("/topdown/library/get").param("id", "1").accept(MediaType.APPLICATION_JSON)).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.quantity").value(150l));
    }

}

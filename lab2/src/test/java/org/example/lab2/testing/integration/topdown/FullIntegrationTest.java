package org.example.lab2.testing.integration.topdown;

import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.model.Borrowing;
import org.example.testing.intergration.topdown.model.Student;
import org.example.testing.intergration.topdown.repository.BookRepository;
import org.example.testing.intergration.topdown.repository.BorrowingRepository;
import org.example.testing.intergration.topdown.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("topdown")
public class FullIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    BorrowingRepository borrowingRepository;

    @BeforeEach
    void populateRespositories(){
        var b1 = new Book();
        b1.setTitle("Java");
        b1.setAuthor("Java");
        b1.setQuantity(100l);
        bookRepository.save(b1);

        var s1 = new Student();
        s1.setName("Java");
        s1.setAge(23);
        studentRepository.save(s1);

        var br = new Borrowing();
        br.setBook(b1);
        br.setStudent(s1);

        borrowingRepository.save(br);
    }

    @Test
    void Test_Controller_And_Service() throws Exception {
        mockMvc.perform(get("/topdown/library/get").param("id", "1").accept(MediaType.APPLICATION_JSON)).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.quantity").value(100l));
    }
}

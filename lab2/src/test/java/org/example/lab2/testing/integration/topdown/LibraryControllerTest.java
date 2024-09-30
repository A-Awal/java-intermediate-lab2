package org.example.lab2.testing.integration.topdown;

import org.example.testing.intergration.topdown.api.LibraryController;
import org.example.testing.intergration.topdown.dtos.BookDto;
import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.services.LibraryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.function.Function;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles("topdown")
@WebMvcTest(controllers = LibraryController.class)
public class LibraryControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    LibraryService libraryService;

    BookDto bookDto = new BookDto("sh", "hsh",  190l);



@Test
    void getBookByIDTest() throws Exception {
        Function<Book, BookDto> mapper = b -> bookDto;
        when(libraryService.findById(anyInt(), any())).thenReturn(bookDto);

        mockMvc.perform(get("/topdown/library/get").param("id", "1")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.quantity").value(190l));
    }


}

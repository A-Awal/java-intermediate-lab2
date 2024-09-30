package org.example.lab2.testing.integration.topdown;

import org.example.testing.intergration.topdown.dtos.BookDto;
import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.repository.BookRepository;
import org.example.testing.intergration.topdown.services.LibraryService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

//@SpringBootTest
@ActiveProfiles("topdown")
public class LibraryServisceTest {

    BookRepository bookRepository = Mockito.mock(BookRepository.class);
    LibraryService libraryService = new LibraryService(bookRepository);



    @Test
    void Get_Book_By_Id() {
        Book b1 = new Book();
        b1.setTitle("Java");
        b1.setAuthor("Java");
        b1.setQuantity(100l);

        when(bookRepository.findById(anyInt())).thenReturn(Optional.of(b1));
        Book book = libraryService.findById(1);
        assertThat(book).isNotNull();
        assertThat(book.getAuthor()).isEqualTo("Java");
    }
}

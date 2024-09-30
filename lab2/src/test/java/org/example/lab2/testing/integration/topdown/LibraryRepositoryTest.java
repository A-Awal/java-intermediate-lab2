package org.example.lab2.testing.integration.topdown;

import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.model.Borrowing;
import org.example.testing.intergration.topdown.model.Student;
import org.example.testing.intergration.topdown.repository.BookRepository;
import org.example.testing.intergration.topdown.repository.BorrowingRepository;
import org.example.testing.intergration.topdown.repository.StudentRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class LibraryRepositoryTest {
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
    void getBook(){
        var book = bookRepository.findById(1);
        assertThat(book.get()).isInstanceOf(Book.class);
        assertThat(book.get().getAuthor()).isEqualTo("Java");
    }
    
   
}

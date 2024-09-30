package org.example.testing.intergration.topdown.config;

import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.model.Borrowing;
import org.example.testing.intergration.topdown.model.Student;
import org.example.testing.intergration.topdown.services.BorrowingService;
import org.example.testing.intergration.topdown.services.LibraryService;
import org.example.testing.intergration.topdown.services.StudentService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;

@Profile("topdowm")
@Configuration
public class TopdownConfig {

    @Bean
    public ApplicationListener<ApplicationReadyEvent> init(LibraryService libraryService, StudentService studentService, BorrowingService borrowingService) {
        return (application) -> {
            var b1 = new Book();
            b1.setTitle("Java");
            b1.setAuthor("Java");
            b1.setQuantity(100l);
            libraryService.save(b1);

            var b2 = new Book();
            b2.setTitle("Python");
            b2.setAuthor("Python");
            b2.setQuantity(200l);
            libraryService.save(b2);

            var s1 = new Student();
            s1.setName("Java");
            s1.setAge(23);
            studentService.save(s1);

            var br = new Borrowing();
            br.setBook(b1);
            br.setStudent(s1);

           borrowingService.save(br);
        };
    }
}

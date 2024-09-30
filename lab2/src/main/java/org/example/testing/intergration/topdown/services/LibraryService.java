package org.example.testing.intergration.topdown.services;

import org.example.testing.intergration.common.BaseService;
import org.example.testing.intergration.common.JpaBaseService;
import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.repository.BookRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Profile("topdown")
public class LibraryService extends JpaBaseService<Book, Integer> {
    public LibraryService(BookRepository bookRepository) {
        super(bookRepository);
    }
}

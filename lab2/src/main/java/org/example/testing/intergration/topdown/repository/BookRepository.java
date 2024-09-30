package org.example.testing.intergration.topdown.repository;

import org.example.testing.intergration.topdown.model.Book;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("topdown")
public interface BookRepository extends JpaRepository<Book, Integer> {

}

package org.example.testing.intergration.topdown.repository;

import org.example.testing.intergration.topdown.model.Borrowing;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Profile("topdown")
public interface BorrowingRepository extends JpaRepository<Borrowing, Integer> {

    @Modifying
    @Query(value = "INSERT into borrowing (book_id, student_id) values (:bk_id, :st_id)", nativeQuery = true)
    public void addBorrowing(@Param("bk_id") Integer bk_id, @Param("st_id") Integer st_id);
}

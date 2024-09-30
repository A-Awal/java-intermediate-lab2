package org.example.testing.intergration.topdown.repository;

import org.example.testing.intergration.topdown.model.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("topdown")
public interface StudentRepository extends JpaRepository<Student , Integer> {
}

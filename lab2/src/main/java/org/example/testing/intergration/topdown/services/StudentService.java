package org.example.testing.intergration.topdown.services;

import org.example.testing.intergration.common.BaseService;
import org.example.testing.intergration.common.JpaBaseService;
import org.example.testing.intergration.topdown.model.Student;
import org.example.testing.intergration.topdown.repository.StudentRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Profile("topdown")
public class StudentService extends JpaBaseService<Student, Integer> {
    public StudentService(StudentRepository studentRepository) {
        super(studentRepository);
    }
}

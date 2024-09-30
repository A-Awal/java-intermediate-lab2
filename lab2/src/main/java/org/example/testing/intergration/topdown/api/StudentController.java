package org.example.testing.intergration.topdown.api;

import org.example.testing.intergration.topdown.services.StudentService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topdow/user")
@Profile("topdowm")
public class StudentController {

    private final StudentService _studentService;

    public StudentController(StudentService studentService) {
        _studentService = studentService;
    }
}

package org.example.spring_mvc.ex1;

import org.example.spring_mvc.ex2.Message;
import org.example.spring_mvc.ex2.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Profile("thymeleaf")
@RequestMapping("/")
public class WelcomeController {
    @GetMapping()
    public String greetings( Model model) {
        model.addAttribute("message", "world" );
        model.addAttribute("lbl", new Message("name", "school"));
        model.addAttribute("student", new Student());
        return "welcome";
    }

    @PostMapping
    public String receiveResult(Model model, @ModelAttribute("student") Student student){
        model.addAttribute("message", student.getName() );
        model.addAttribute("lbl", new Message("name", "school"));
        model.addAttribute("student", student);
        return "welcome";
    }
}

package com.amigos.tutorial;

import com.amigos.tutorial.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class TutorialApplication {

    public static void main(String[]    args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

    @GetMapping("/hello")
    public List<String> hello() {
        return List.of("Hello", "World");
    }

    @GetMapping
    public List<Student> createStudent() {
        return List.of(
                new Student(
                        1L,
                        "Fadhil",
                        "fadhil@yopmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }
}

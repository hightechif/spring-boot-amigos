package com.amigos.tutorial.controller;

import com.amigos.tutorial.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent() {
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

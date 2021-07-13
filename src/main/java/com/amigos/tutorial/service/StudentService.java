package com.amigos.tutorial.service;

import com.amigos.tutorial.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

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

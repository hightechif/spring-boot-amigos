package com.amigos.tutorial.model;

import com.amigos.tutorial.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student fadhil = new Student(
                    "Fadhil",
                    "fadhil@yopmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@yopmail.com",
                    LocalDate.of(2004, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(fadhil, mariam)
            );
        };
    }
}

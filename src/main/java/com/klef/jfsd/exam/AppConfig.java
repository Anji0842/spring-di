package com.klef.jfsd.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@Configuration
public class AppConfig {

    // Define Employee Bean using Constructor Dependency Injection
    @Bean
    public Employee employee() {
        return new Employee(
                101, 
                "John Doe", 
                75000.0, 
                "IT", 
                Arrays.asList("Java", "Spring", "SQL")
        );
    }

    // Define Instructor Bean
    @Bean
    @Scope("singleton")
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(201);
        instructor.setName("Alice Smith");
        instructor.setEmail("alice@example.com");
        instructor.setPhoneNumber("1234567890");
        return instructor;
    }

    // Define Course Bean using Setter Autowiring
    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseId(301);
        course.setCourseName("Spring Basics");
        course.setCredits(5);
        course.setInstructor(instructor()); // Manually wiring the Instructor bean
        return course;
    }
}

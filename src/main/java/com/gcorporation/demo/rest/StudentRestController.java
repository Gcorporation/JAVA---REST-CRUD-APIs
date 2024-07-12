package com.gcorporation.demo.rest;

import com.gcorporation.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Prabhjot", "Singh"));

        theStudents.add(new Student("Shaminder", "Singh"));

        theStudents.add(new Student("Ghussa", "Singh"));

        theStudents.add(new Student("Bhindi", "Singh"));

        return theStudents;
    }
}

package com.learn.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springapp.entity.Student;
import com.learn.springapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PostMapping
    public Student findAll(Student student){
        return studentService.save(student);
    }
}

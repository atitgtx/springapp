package com.learn.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springapp.entity.Student;
import com.learn.springapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }
    
}

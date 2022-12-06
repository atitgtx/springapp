package com.learn.springapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.learn.springapp.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
    
    List<Student> findAll();
}

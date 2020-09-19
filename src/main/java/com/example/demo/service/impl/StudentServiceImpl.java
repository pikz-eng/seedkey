package com.example.demo.service.impl;

import com.example.demo.entity.Class;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl extends AbstractService<Student, StudentRepository> {


    public StudentServiceImpl(StudentRepository repository) {
        super(repository);

    }

    }







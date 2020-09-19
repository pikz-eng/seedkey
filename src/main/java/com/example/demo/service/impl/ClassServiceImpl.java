package com.example.demo.service.impl;

import com.example.demo.entity.Class;
import com.example.demo.entity.Student;
import com.example.demo.repository.ClassRepository;
import com.example.demo.service.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImpl extends AbstractService<Class,ClassRepository> {

    public ClassServiceImpl(ClassRepository repository) {
        super(repository);
    }


}


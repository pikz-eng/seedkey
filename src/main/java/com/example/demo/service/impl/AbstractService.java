package com.example.demo.service.impl;

import com.example.demo.entity.AbstractEntity;
import com.example.demo.entity.Class;
import com.example.demo.entity.Student;
import com.example.demo.repository.CommonRepository;
import com.example.demo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public abstract class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>> implements CommonService<E> {
    protected final R repository;


    protected AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public Student create(Student student) {
       return null;
    }

    @Override
    public Class create(Class myclass) {
        return null;
    }
}




package com.example.demo.service;


import com.example.demo.entity.Class;
import com.example.demo.repository.ClassRepository;
import com.example.demo.service.impl.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClassService extends CommonService<Class> {
    Class create(Class myClass);

    List<Class> getAll();

    Optional<Class> getById(Long id);

    Class update(Class myClass);

    void delete(Long id);


}

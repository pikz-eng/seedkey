package com.example.demo.service;

import com.example.demo.entity.AbstractEntity;
import com.example.demo.entity.Class;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


public interface CommonService<E extends AbstractEntity> {
    Student create(Student student);
    Class create(Class myclass);


}

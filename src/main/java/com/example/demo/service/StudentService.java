package com.example.demo.service;

import com.example.demo.entity.Class;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Service
public interface StudentService extends CommonService<Student> {

    Student create(Student student);

    List<Student> getAll();

    Optional<Student> getById(Long id);

    Student update(Student student);

    void delete(Long id);

}

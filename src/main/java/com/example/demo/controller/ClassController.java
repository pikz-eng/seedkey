package com.example.demo.controller;

import com.example.demo.entity.Class;
import com.example.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/class")
public class ClassController extends AbstractController<Class, ClassService> {


    protected ClassController(ClassService service) {
        super(service);
    }
}

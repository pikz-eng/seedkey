package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data//foloseste noargs constructor +allargs,setter,getter

public class Student extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    @Column
    private String name;
    @Column
    private Integer age;
}

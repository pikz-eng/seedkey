package com.example.demo.entity;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Data

@Entity
public class Class extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column
    private String name;

}

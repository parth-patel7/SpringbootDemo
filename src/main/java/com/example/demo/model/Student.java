package com.example.demo.model;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "studentDB")
public class Student {

    @Id
    @Basic(optional = false)
    @Column(name = "studentID",unique=true, nullable = false)
    private Integer studentID;
    private String name;
    private int grade;
    private int age;

}

package com.example.demo.service;

import com.example.demo.Repository.StudentDAO;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService{

    @Autowired
    private StudentDAO studentDAO;

    public Student getStudentByID(int ID){
        // DAO.getByID didnt work?
        Student student = studentDAO.findById(ID).get();
        return student;
    }

    public void addStudent(Student student){
        studentDAO.saveAndFlush(student);
    }



}

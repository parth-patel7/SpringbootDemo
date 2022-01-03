package com.example.demo.Repository;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class StudentRepo {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity getStudentByID(@PathParam("ID") int ID){
        Student student = studentService.getStudentByID(ID);
        System.out.println("GET Request for ID: " + ID);
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        System.out.print("POST Request: ");
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }
}

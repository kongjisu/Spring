package com.spring.springStart.controller;


import com.spring.springStart.model.Student;
import com.spring.springStart.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
            studentService.saveStudent(student);
        return "New Student is added";
    }
    @GetMapping("/getALL")
    public List<Student> list(){
        return studentService.getAllStudents();
    }

}

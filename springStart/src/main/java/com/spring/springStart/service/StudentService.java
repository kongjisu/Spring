package com.spring.springStart.service;

import com.spring.springStart.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();


}

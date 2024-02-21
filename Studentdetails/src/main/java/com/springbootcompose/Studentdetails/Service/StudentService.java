package com.springbootcompose.Studentdetails.Service;

import com.springbootcompose.Studentdetails.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    public String saveStudent(Student student);
    public Student getStudentById(Integer studentId);
    public List<Student> getAllStudent();
    public String updateStudent(Student student);

}

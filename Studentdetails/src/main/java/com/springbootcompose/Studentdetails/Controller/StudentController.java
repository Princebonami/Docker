package com.springbootcompose.Studentdetails.Controller;

import com.springbootcompose.Studentdetails.Entity.Student;
import com.springbootcompose.Studentdetails.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student)
    {
       return studentServiceImpl.saveStudent(student);
    }

    @GetMapping("/get/{studentId}")
    public Student getStudentById(@PathVariable("studentId") Integer studentId)
    {
       return studentServiceImpl.getStudentById(studentId);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent()
    {
      return studentServiceImpl.getAllStudent();
    }

    public String updateStudent(@RequestBody Student student)
    {
        return studentServiceImpl.updateStudent(student);
    }
}

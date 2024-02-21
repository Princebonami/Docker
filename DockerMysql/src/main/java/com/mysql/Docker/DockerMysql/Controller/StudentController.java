package com.mysql.Docker.DockerMysql.Controller;

import com.mysql.Docker.DockerMysql.Entity.Student;
import com.mysql.Docker.DockerMysql.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @PostMapping("/save")
    public String saveStudent( @RequestBody Student student)
    {
       return studentServiceImpl.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudent()
    {
       return studentServiceImpl.getAllStudent();
    }

    @GetMapping("/save/studentId")
    public Student getStudent(@PathVariable Integer studentId)
    {
       return studentServiceImpl.getStudent(studentId);
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody  Student student)
    {
      return  studentServiceImpl.updateStudent(student);
    }


}

package com.mysql.Docker.DockerMysql.Service;


import com.mysql.Docker.DockerMysql.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public String saveStudent(Student student);
    public List<Student> getAllStudent();
    public Student getStudent(Integer studentId);
    public String updateStudent(Student student);

}

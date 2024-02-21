package com.mysql.Docker.DockerMysql.Service;

import com.mysql.Docker.DockerMysql.Entity.Student;
import com.mysql.Docker.DockerMysql.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String saveStudent(Student student) {

        studentRepository.save(student);
        return "Student details registered Sucessfully";
    }

    @Override
    public List<Student> getAllStudent() {
        return  studentRepository.findAll();
    }

    @Override
    public Student getStudent(Integer studentId) {
       return studentRepository.findById(studentId).get();
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Student details gets updated sucessfully";
    }
}

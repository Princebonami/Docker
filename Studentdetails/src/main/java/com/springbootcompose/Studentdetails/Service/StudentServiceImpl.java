package com.springbootcompose.Studentdetails.Service;

import com.springbootcompose.Studentdetails.Entity.Student;
import com.springbootcompose.Studentdetails.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;


    @Override
    public String saveStudent(Student student) {

        studentRepo.save(student);
        return "Student gets registered sucessfully";
    }

    @Override
    public Student getStudentById(Integer studentId) {

        return studentRepo.findById(studentId).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public String updateStudent(Student student) {

        studentRepo.save(student);
        return "Student details gets updated sucessfully";
    }
}

package com.springbootcompose.Studentdetails.Repository;

import com.springbootcompose.Studentdetails.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}

package com.mysql.Docker.DockerMysql.Repository;

import com.mysql.Docker.DockerMysql.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}

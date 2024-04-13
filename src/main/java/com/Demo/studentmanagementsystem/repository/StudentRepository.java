package com.Demo.studentmanagementsystem.repository;

import com.Demo.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {

}

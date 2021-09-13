package com.quocan.bt_springdatajpa.repository;

import com.quocan.bt_springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select * from student", nativeQuery = true)
    public List<Student> getStudents();


}


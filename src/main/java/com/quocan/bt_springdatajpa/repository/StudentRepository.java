package com.quocan.bt_springdatajpa.repository;

import com.quocan.bt_springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    @Query(value = "select s from Student s where s.lastName =?1")
    public Student getStudentByLastName(String lastName);
}

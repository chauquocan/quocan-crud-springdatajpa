package com.quocan.bt_springdatajpa.repository;

import com.quocan.bt_springdatajpa.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}

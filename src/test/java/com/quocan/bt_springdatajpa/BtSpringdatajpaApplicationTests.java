package com.quocan.bt_springdatajpa;

import com.quocan.bt_springdatajpa.entity.Student;
import com.quocan.bt_springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BtSpringdatajpaApplicationTests {
    @Autowired
    private StudentRepository repository;

    //test native query for native_branch
    @Test
    void test() {
        List<Student> students = repository.getStudents();
    }

}

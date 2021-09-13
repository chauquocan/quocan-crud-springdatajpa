package com.quocan.bt_springdatajpa;

import com.quocan.bt_springdatajpa.entity.Student;
import com.quocan.bt_springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BtSpringdatajpaApplicationTests {

    @Autowired
    private StudentRepository repository;

    //test jpql query for jpql_branch
    @Test
    void test() {
        Student student = repository.getStudentByLastName("chau");
    }

}

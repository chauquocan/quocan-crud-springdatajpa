package com.quocan.bt_springdatajpa;

import com.quocan.bt_springdatajpa.entity.Student;
import com.quocan.bt_springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BtSpringdatajpaApplicationTests {
    @Autowired
    private StudentRepository studentRepository;

    //test sql cua repo_branch
    @Test
    private void insertStudent() {
        Student student = Student.builder()
                .firstName("quoc an")
                .lastName("chau")
                .email("guoan209")
                .phone("1234")
                .build();
        studentRepository.save(student);
    }
}

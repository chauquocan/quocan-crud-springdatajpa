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
    void saveStudent() {
        Student student = new Student(12, "Nguyen", "An", "an@gmail.com", "0789295422");
        studentRepository.save(student);
    }

    @Test
    void deleteStudent() {
        studentRepository.deleteById(11l);
    }
}

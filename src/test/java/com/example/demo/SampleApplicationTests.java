package com.example.demo;

import com.example.demo.service.impl.StudentServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {
    static StudentServiceImpl ssi = new StudentServiceImpl();
    @Test
    static void contextLoads() {
        ssi.getAllStudent();
    }
    public static void main(String args[]){
        contextLoads();

    }

}

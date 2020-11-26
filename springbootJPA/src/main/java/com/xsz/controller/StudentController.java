package com.xsz.controller;

import com.xsz.entity.Student;
import com.xsz.repository.StudentRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {
    @Resource
    StudentRepository studentRepository;

    @RequestMapping("all")
    public List<Student> getStudents(){
        return  studentRepository.findAll();
    }

    @RequestMapping("find/{id}")
    public Student getStudentsByID(@PathVariable("id") String id){
        return  studentRepository.findById(id).get();
    }
}

package com.one_to_one_bidirectional.controller;

import com.one_to_one_bidirectional.model.StudentModel;
import com.one_to_one_bidirectional.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @GetMapping("/getAll")
    private List<StudentModel> getAll(){
        return studentServiceImpl.getAll();
    }
}

package com.one_to_one_bidirectional.service;

import com.one_to_one_bidirectional.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    //getAll
    List<StudentModel> getAll();
}

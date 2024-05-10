package com.one_to_one_bidirectional.serviceImpl;


import com.one_to_one_bidirectional.model.StudentModel;
import com.one_to_one_bidirectional.repository.StudentRepository;
import com.one_to_one_bidirectional.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<StudentModel> getAll() {
        return studentRepository.findAll();
    }
}

package com.one_to_one_bidirectional.repository;

import com.one_to_one_bidirectional.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel,Long> {
}

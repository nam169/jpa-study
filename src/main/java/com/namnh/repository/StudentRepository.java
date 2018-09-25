package com.namnh.repository;

import org.springframework.data.repository.CrudRepository;

import com.namnh.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}

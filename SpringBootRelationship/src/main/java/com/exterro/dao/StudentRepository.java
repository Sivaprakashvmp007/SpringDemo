package com.exterro.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exterro.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}

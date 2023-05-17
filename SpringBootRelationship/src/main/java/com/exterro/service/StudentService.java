package com.exterro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.entity.Student;
@Service
public interface StudentService {
	Student addStudent(Student student);
	Student getStudent(Integer rollNo);
	List<Student> getAllStudent();
	Student updateStudent(Student student);
	String deleteStudent(Integer rollNo);
}

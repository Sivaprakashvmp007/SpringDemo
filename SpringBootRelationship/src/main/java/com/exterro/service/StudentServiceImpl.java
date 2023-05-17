package com.exterro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.dao.StudentRepository;
import com.exterro.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	@Override
	public Student addStudent(Student student) {
		return studRepo.save(student);
	}

	@Override
	public Student getStudent(Integer rollNo) {
		return studRepo.findById(rollNo).orElse(new Student());
	}

	@Override
	public List<Student> getAllStudent() {
		return studRepo.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		Student oldStudentData = studRepo.findById(student.getRollNo()).orElse(null);
		if(oldStudentData != null)
		{
			studRepo.delete(oldStudentData);
		}
		return studRepo.save(student);
	}

	@Override
	public String deleteStudent(Integer rollNo) {
		Student oldStudentData = studRepo.findById(rollNo).orElse(null);
		if(oldStudentData != null)
		{
			studRepo.delete(oldStudentData);
			return "Student Deleted";
		}
		return "Student Unavilable";
	}

}

package com.exterro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exterro.entity.Student;
import com.exterro.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("index")
	public String getIndex() {
		return "index.html";
	}
	
	@RequestMapping("addStudent")
	@ResponseBody
	public String addStudent(Student student) {
		return studentService.addStudent(student).toString();
	}
	
	@RequestMapping("viewStudent")
	@ResponseBody
	public String viewStudent(int rollNo) {
		return studentService.getStudent(rollNo).toString();
	}
	
	@RequestMapping("viewAllStudent")
	@ResponseBody
	public String viewAllStudent() {
		return studentService.getAllStudent().toString();
	}
	
	@RequestMapping("updateStudent")
	@ResponseBody
	public String updateStudent(Student student) {
		return studentService.updateStudent(student).toString();
	}
	
	@RequestMapping("deleteStudent")
	@ResponseBody
	public String deleteStudent(int rollNo) {
		return studentService.deleteStudent(rollNo);
	}
	
}

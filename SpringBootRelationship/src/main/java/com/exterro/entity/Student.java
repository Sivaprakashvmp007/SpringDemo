package com.exterro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer rollNo;
	private String studName;
	private Float studGrade;
	
	public Student() {
		super();
	}
	public Student(Integer rollNo, String studName, Float studGrade) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.studGrade = studGrade;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Float getStudGrade() {
		return studGrade;
	}
	public void setStudGrade(Float studGrade) {
		this.studGrade = studGrade;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", studGrade=" + studGrade + "]";
	}
}

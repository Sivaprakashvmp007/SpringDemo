package com.exterro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Mark {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer markId;
	private String subjectName;
	private Integer markValue;
	
	@ManyToOne
	@JoinColumn(name = "rollNo")
	private Student student;

	public Mark() {
		super();
		
	}

	public Mark(Integer markId, String subjectName, Integer markValue, Student student) {
		super();
		this.markId = markId;
		this.subjectName = subjectName;
		this.markValue = markValue;
		this.student = student;
	}

	public Integer getMarkId() {
		return markId;
	}

	public void setMarkId(Integer markId) {
		this.markId = markId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getMarkValue() {
		return markValue;
	}

	public void setMarkValue(Integer markValue) {
		this.markValue = markValue;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Mark [markId=" + markId + ", subjectName=" + subjectName + ", markValue=" + markValue + ", student="
				+ student + "]";
	}

	
}

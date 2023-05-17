package com.exterro.entity;

public class MarkRequest {
	private Integer markId;
	private String subjectName;
	private Integer markValue;
	private Integer studentRollNo;
	public MarkRequest() {
		super();
	}
	public MarkRequest(Integer markId, String subjectName, Integer markValue, Integer studentRollNo) {
		super();
		this.markId = markId;
		this.subjectName = subjectName;
		this.markValue = markValue;
		this.studentRollNo = studentRollNo;
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
	public Integer getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(Integer studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	@Override
	public String toString() {
		return "MarkRequest [markId=" + markId + ", subjectName=" + subjectName + ", markValue=" + markValue
				+ ", studentRollNo=" + studentRollNo + "]";
	}
	
}

package com.exterro.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.dao.MarkRepository;
import com.exterro.dao.StudentRepository;
import com.exterro.entity.Mark;
import com.exterro.entity.MarkRequest;
import com.exterro.entity.Student;
@Service
public class MarkServiceImpl implements MarkService{
	@Autowired
	private MarkRepository markRepo;
	
	@Autowired
	private StudentRepository studRepo;
	
	@Override
	public Mark addMark(MarkRequest mark) {
		Mark mark1 =new Mark();
		BeanUtils.copyProperties(mark, mark1);
		Student stud = studRepo.findById(mark.getStudentRollNo()).orElse(null);
		mark1.setStudent(stud);
		return markRepo.save(mark1);
	}

	@Override
	public Mark getMark(Integer markId) {
		return markRepo.findById(markId).orElse(new Mark());
	}

	@Override
	public List<Mark> getAllMark() {
		return markRepo.findAll();
	}

	@Override
	public Mark updateMark(MarkRequest mark) {
		Student student = studRepo.findById(mark.getStudentRollNo()).orElse(null);
		
		if(student != null) {
			Mark markNew = new Mark();
			BeanUtils.copyProperties(mark, markNew);
			markNew.setStudent(student);
			Mark mark1 = markRepo.findById(mark.getMarkId()).orElse(null);
			if(mark1 != null) {
				markRepo.delete(mark1);
			}
			return markRepo.save(markNew);
		}
		return null;
	}

	@Override
	public String deleteMark(Integer markId) {
		Mark mark1 = markRepo.findById(markId).orElse(null);
		if(mark1 != null) {
			markRepo.delete(mark1);
			return "Mark Deleted";
		}
		return "Mark Unavailable";
	}

}

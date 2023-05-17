package com.exterro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.entity.Mark;
import com.exterro.entity.MarkRequest;
@Service
public interface MarkService {
	Mark addMark(MarkRequest mark);
	Mark getMark(Integer markId);
	List<Mark> getAllMark();
	Mark updateMark(MarkRequest mark);
	String deleteMark(Integer markId);
}

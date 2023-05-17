package com.exterro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exterro.entity.MarkRequest;
import com.exterro.entity.Student;
import com.exterro.service.MarkService;

@Controller
public class MarkController {
	@Autowired
	private MarkService markService;
	
	@RequestMapping("addMark")
	@ResponseBody
	public String addMark(MarkRequest markReq) {
		return markService.addMark(markReq).toString();
	}
	
	@RequestMapping("viewMark")
	@ResponseBody
	public String viewStudent(int markId) {
		return markService.getMark(markId).toString();
	}
	
	@RequestMapping("viewAllMark")
	@ResponseBody
	public String viewAllMark() {
		return markService.getAllMark().toString();
	}
	
	@RequestMapping("updateMark")
	@ResponseBody
	public String updateMark(MarkRequest markReq) {
		return markService.updateMark(markReq).toString();
	}
	
	@RequestMapping("deleteMark")
	@ResponseBody
	public String deleteMark(int markId) {
		return markService.deleteMark(markId);
	}
	
}

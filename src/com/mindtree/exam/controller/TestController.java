package com.mindtree.exam.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mindtree.exam.constants.StudentConstants;
import com.mindtree.exam.entity.Test;
import com.mindtree.exam.exceptions.ServiceException;
import com.mindtree.exam.service.Studentservice;
import com.mindtree.exam.vaildation.TestValidator;
import com.mindtree.exam.view.StudentVo;
import com.mindtree.exam.view.Result;

@Controller
@SessionAttributes("Student")
public class TestController {
	@Autowired
	Studentservice studentservice;
	@Autowired
	TestValidator validator;

	@RequestMapping(value = StudentConstants.TESTACTION, method = RequestMethod.POST)
	public String saveTestDetail(@ModelAttribute("test") Test test,
			@ModelAttribute("Student") StudentVo studentVo,
			BindingResult errors, Model model) {
		Integer reg = studentVo.getRegistrationNumber();
		// validator.validate(test, errors);
		if (errors.hasErrors()) {
			return StudentConstants.StudentDetailPAGE;
		} else {
			try {
				studentservice.saveTest(test, reg);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return StudentConstants.success;
	}

	@RequestMapping(value = "/getstudent.htm", method = RequestMethod.GET)
	public String getStudent(Model model) {
		List<Test> tests = studentservice.getAll();
		List<Result> results = new ArrayList<Result>();

		for (Test TEST : tests) {
			
		}
		for (Result result : results) {
			System.out.println(result.getName() + " " + result.getGrade());
		}
		model.addAttribute("result", results);
		return "result";
	}

}

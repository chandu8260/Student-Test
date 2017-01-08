package com.mindtree.exam.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mindtree.exam.constants.StudentConstants;
import com.mindtree.exam.entity.Test;
import com.mindtree.exam.exceptions.ServiceException;
import com.mindtree.exam.service.Studentservice;
import com.mindtree.exam.view.StudentVo;

@Controller
@SessionAttributes("Student")
@RequestMapping(method = RequestMethod.GET)
public class StudentController {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(StudentController.class);
	@Autowired
	Studentservice studentservice;

	@RequestMapping(value = StudentConstants.REGISTARTIONACTION)
	public String registarionNumber(
			@ModelAttribute("student") StudentVo studentVo, Model model) {
		try {
			List<StudentVo> studentVos = studentservice.getAllStudent();
			model.addAttribute("regnumbers", studentVos);
		} catch (Exception e) {
			System.out.println("first");
			model.addAttribute("exception", "notexist");
			return StudentConstants.EXCEPTIONPAGE;
		}

		return StudentConstants.REGISTARTIONPAGE;
	}

	@RequestMapping(value = StudentConstants.GETEREGNO)
	public String getStudentDetail(@ModelAttribute("test") Test test,BindingResult error,
			@RequestParam("registrationNumber") Integer regNumber, Model model) {
		try {
			StudentVo studentVo = studentservice.getStudent(regNumber);
			model.addAttribute("Student", studentVo);
		} catch (ServiceException e) {
			System.out.println("second");
			model.addAttribute("exception", "retriveproblem");
		} catch (NullPointerException e) {
			System.out.println("third");
			model.addAttribute("exception", "retriveproblem");
			return StudentConstants.EXCEPTIONPAGE;
		}

		return StudentConstants.StudentDetailPAGE;
	}
}

package com.mindtree.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.exam.constants.StudentConstants;

@Controller
public class HomeController {
	@RequestMapping(value=StudentConstants.HOMEPAGE)
	public String homePage()
	{
		return StudentConstants.HOME ;
	}

}

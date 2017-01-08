package com.mindtree.exam.vaildation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mindtree.exam.entity.Test;

public class TestValidator  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Test.class);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Test test = (Test) object;
		double testMaxmark = test.getActualMark();
		double testObtmark = test.getStudentMark();
		System.out.println(test.getActualMark()+" "+test.getStudentMark());
		if(testMaxmark<testObtmark)
		{
			errors.rejectValue("studentMark", "mark.check");
		}
	}

}

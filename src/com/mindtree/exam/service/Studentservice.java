package com.mindtree.exam.service;

import java.util.List;

import com.mindtree.exam.entity.Student;
import com.mindtree.exam.entity.Test;
import com.mindtree.exam.exceptions.ServiceException;
import com.mindtree.exam.view.StudentVo;

public interface Studentservice {

	public List<StudentVo> getAllStudent() throws ServiceException;
	public StudentVo getStudent(Integer regNum) throws ServiceException;
	public void saveTest(Test test,Integer reg) throws ServiceException;
	public List<Test> getAll();
}

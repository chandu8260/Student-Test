package com.mindtree.exam.dao;

import java.util.List;

import com.mindtree.exam.entity.Student;
import com.mindtree.exam.entity.Test;
import com.mindtree.exam.exceptions.DaoException;

public interface StudentDao {

	public List<Student> getAllStudent() throws DaoException;
	public Student getStudent(Integer regNum) throws DaoException;
	public void saveTestDetail(Test test,Integer reg) throws DaoException;
	public List<Test> getall();
}

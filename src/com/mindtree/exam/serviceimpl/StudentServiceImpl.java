/**
 * 
 */
package com.mindtree.exam.serviceimpl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.exam.dao.StudentDao;
import com.mindtree.exam.entity.Student;
import com.mindtree.exam.entity.Test;
import com.mindtree.exam.exceptions.DaoException;
import com.mindtree.exam.exceptions.ServiceException;
import com.mindtree.exam.service.Studentservice;
import com.mindtree.exam.view.StudentVo;

/**
 * @author M1018161
 * 
 */
@Transactional
public class StudentServiceImpl implements Studentservice{

	@Autowired
	private StudentDao studentDao;

	@Transactional(readOnly=true,isolation=Isolation.READ_COMMITTED)
	@Override
	public List<StudentVo> getAllStudent() throws ServiceException {
		List<Student> students;
		List<StudentVo> studentVos =  new ArrayList<StudentVo>();
		try {
			students = studentDao.getAllStudent();
			for(Student student : students)
			{
				StudentVo studentVo = new StudentVo(student.getStudentName(),student.getAddress(),student.getRegistrationNumber(),student.getPhoneNumber());
				studentVos.add(studentVo);
			}
			return studentVos;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		
	}

	@Transactional(readOnly=true,isolation=Isolation.READ_COMMITTED)
	@Override
	public StudentVo getStudent(Integer regNum) throws ServiceException {
		try {
			Student student = studentDao.getStudent(regNum);
			StudentVo studentVo = new StudentVo();
			studentVo.setRegistrationNumber(student.getRegistrationNumber());
			studentVo.setAddress(student.getAddress());
			studentVo.setPhoneNumber(student.getPhoneNumber());
			studentVo.setStudentName(student.getStudentName());
			return studentVo;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	@Override
	public void saveTest(Test test, Integer reg) throws ServiceException {
		try {
			studentDao.saveTestDetail(test, reg);
		} catch (DaoException e) {
			throw new ServiceException();
		}
		
	}

	@Transactional(readOnly=true,isolation=Isolation.READ_COMMITTED)
	@Override
	public List<Test> getAll() {
		
		return studentDao.getall();
	}

}

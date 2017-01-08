/**
 * 
 */
package com.mindtree.exam.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mindtree.exam.dao.StudentDao;
import com.mindtree.exam.entity.Student;
import com.mindtree.exam.entity.Test;
import com.mindtree.exam.exceptions.DaoException;
import com.mindtree.exam.query.StudentQuery;

/**
 * @author M1018161
 * 
 */
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Student> getAllStudent() throws DaoException {
		try {
			List<Student> students = hibernateTemplate
					.find(StudentQuery.GETALLSTUDENTS);
			return students;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}

	}

	@Override
	public Student getStudent(Integer regNum) throws DaoException {
		try {
			Student student = hibernateTemplate.get(Student.class, regNum);
			return student;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}

	}

	@Override
	public void saveTestDetail(Test test,Integer reg) throws DaoException {
		Student student = hibernateTemplate.get(Student.class, reg);
		test.setStudent(student);
		try {
			hibernateTemplate.save(test);
			
		} catch (Exception e) {
			throw new DaoException();
		}
	}

	@Override
	public List<Test> getall() {
	List<Test> tests = hibernateTemplate.find("from Test");
		return tests;
	}

}

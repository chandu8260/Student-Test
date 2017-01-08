package com.mindtree.exam.junittest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mindtree.exam.entity.Test;
import com.mindtree.exam.exceptions.ServiceException;
import com.mindtree.exam.service.Studentservice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/positive-junit.xml"})
public class PositiveTest extends AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private Studentservice studentservice; 
	
	
	/**
	 * @return the studentservice
	 */
	public Studentservice getStudentservice() {
		return studentservice;
	}


	/**
	 * @param studentservice the studentservice to set
	 */
	public void setStudentservice(Studentservice studentservice) {
		this.studentservice = studentservice;
	}


	@org.junit.Test(expected=NullPointerException.class)
	public void testSave() throws ServiceException
	{
		Test test = null;
		studentservice.saveTest(test, 1);
	}
}

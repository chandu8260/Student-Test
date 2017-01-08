package com.mindtree.exam.entity;

public class Test implements Comparable<Test> {
	private Integer testno;
	private String testName;
	private Double actualMark;
	private Double studentMark;
	private Student student;

	/**
	 * @return the testno
	 */
	public Integer getTestno() {
		return testno;
	}

	/**
	 * @param testno
	 *            the testno to set
	 */
	public void setTestno(Integer testno) {
		this.testno = testno;
	}

	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName
	 *            the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the actualMark
	 */
	public Double getActualMark() {
		return actualMark;
	}

	/**
	 * @param actualMark
	 *            the actualMark to set
	 */
	public void setActualMark(Double actualMark) {
		this.actualMark = actualMark;
	}

	/**
	 * @return the studentMark
	 */
	public Double getStudentMark() {
		return studentMark;
	}

	/**
	 * @param studentMark
	 *            the studentMark to set
	 */
	public void setStudentMark(Double studentMark) {
		this.studentMark = studentMark;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((testno == null) ? 0 : testno.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (testno == null) {
			if (other.testno != null)
				return false;
		} else if (!testno.equals(other.testno))
			return false;
		return true;
	}

	/**
	 * @param testno
	 * @param testName
	 * @param actualMark
	 * @param studentMark
	 * @param student
	 */
	public Test(Integer testno, String testName, Double actualMark,
			Double studentMark, Student student) {
		super();
		this.testno = testno;
		this.testName = testName;
		this.actualMark = actualMark;
		this.studentMark = studentMark;
		this.student = student;
	}

	/**
 * 
 */
	public Test() {
		super();
	}

	@Override
	public int compareTo(Test o) {
		return o.getTestno().compareTo(this.getTestno());
	}

}

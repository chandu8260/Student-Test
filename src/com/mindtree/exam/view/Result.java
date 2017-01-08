package com.mindtree.exam.view;

public class Result {
	String name;
	String Grade;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return Grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		Grade = grade;
	}
	/**
	 * @param name
	 * @param grade
	 */
	public Result(String name, String grade) {
		super();
		this.name = name;
		Grade = grade;
	}
	/**
	 * 
	 */
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

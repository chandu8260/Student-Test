/**
 * 
 */
package com.mindtree.exam.exceptions;

/**
 * @author M1018161
 *
 */
public class ApplicationException extends Exception{

	/**
	 * 
	 */
	public ApplicationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public ApplicationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ApplicationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

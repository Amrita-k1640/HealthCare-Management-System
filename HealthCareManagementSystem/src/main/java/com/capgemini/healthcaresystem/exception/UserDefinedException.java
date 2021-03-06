package com.capgemini.healthcaresystem.exception;

/************************************************************************************
*          @author          Princy Pandey
*          Description      It is a user defined exception class 
*          Version          1.0
*          Created Date     23-APR-2020
************************************************************************************/

public class UserDefinedException extends Exception
{       

	private static final long serialVersionUID = 1L;

	public UserDefinedException(String msg) {
		super(msg);
	}
}
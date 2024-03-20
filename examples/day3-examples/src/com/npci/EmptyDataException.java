package com.npci;

public class EmptyDataException extends Exception {
	// Exception class has many constructors which we can call by creating constructors
	// we may need to throw new EmptyDataException("Data is empty")
	public EmptyDataException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmptyDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public EmptyDataException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmptyDataException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmptyDataException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}

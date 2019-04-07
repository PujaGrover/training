package com.veritis.j2se.demos.oops.exceptions;

public class IllegalVoteCasteException extends Exception {
	private int age;
	private String message;

	public IllegalVoteCasteException(int age, String message) {
		this.age = age;
		this.message = message;
	}

	public IllegalVoteCasteException(String message) {
		this.message = message;
	}

	public IllegalVoteCasteException() {
		message=" Your age is not sufficient to vote...";
	}
	
	@Override
	public String toString() {
		return "Your age "+age+" is not eligble for voting please comeback after "+(18-age)+" years.";
	}
	
	public String getMessage(){
		return message;
	}

}

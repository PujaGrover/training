package com.veritis.j2se.demos.oops;

import java.io.FileInputStream;

public class FileThrowsDemo {
	public void validate(int age) throws Exception{
		if(age<18)
			throw (new Exception());
		else
			System.out.println("Your age is valid");
	}
public static void main(String argsp[]) throws Exception{
	FileInputStream fis=new FileInputStream("C:\\Venkata.txt");
}
}

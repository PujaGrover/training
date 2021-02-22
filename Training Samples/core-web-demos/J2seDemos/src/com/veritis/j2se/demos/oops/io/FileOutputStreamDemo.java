package com.veritis.j2se.demos.oops.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File f=new File("c:\\krish\\venkata.jpg");
		try {
			FileWriter fos = new FileWriter("/Users/Mokshagna/Desktop/filedemo/saranu.txt");
			String str = "This file was created to give the Example demo on FileWriter stream\nThis is second line";
			char c[] = str.toCharArray();
			//System.out.println(str.indexOf("\n"));
			fos.write(c);
			// fos.write

			fos.close();
			String str1 = "This file was created to give the Example demo on FileOutputStream";
			FileOutputStream fo = new FileOutputStream("/Users/Mokshagna/Desktop/filedemo/venkata.txt");
			byte b[] = str1.getBytes();
			fo.write(b);
			fo.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

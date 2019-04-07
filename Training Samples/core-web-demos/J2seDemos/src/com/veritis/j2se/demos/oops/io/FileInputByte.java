package com.veritis.j2se.demos.oops.io;

import java.io.File;
import java.io.FileInputStream;

public class FileInputByte {

	public static void main(String[] args) throws Exception{
		File file=new File("/Users/Mokshagna/Desktop/filedemo/Main.java");
		FileInputStream fis=new FileInputStream(file);
		int temp=0;
		while((temp=fis.read()) > 0){
			System.out.print((char)temp);
		}
		fis.close();
	}

}

package com.veritis.j2se.demos.oops.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FileWritingByte {

	public static void main(String[] args) throws Exception{
	System.out.println("Enter any content to send it to file ");
	InputStreamReader scan=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(scan);
	String str=br.readLine();
	byte b[]=str.getBytes();
	FileOutputStream fos=new FileOutputStream("/Users/Mokshagna/Desktop/filedemo/bytedemo.txt");	
//	for(int i=0;i<b.length;i++){
//			fos.write(b[i]);
//	}
	fos.write(b);
	fos.close();
	}

}

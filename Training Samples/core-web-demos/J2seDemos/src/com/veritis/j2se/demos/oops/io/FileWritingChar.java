package com.veritis.j2se.demos.oops.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWritingChar {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter any content to send it to file ");
		InputStreamReader scan=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(scan);
		String str=br.readLine();
		FileWriter fos=new FileWriter("/Users/Mokshagna/Desktop/filedemo/chardemo.txt");	
		fos.write(str);
		fos.close();

	}

}

package com.veritis.j2se.demos.oops.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadingChar {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("/Users/Mokshagna/Desktop/filedemo/Main.java");
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		int count=0;
		while((line=br.readLine())!=null){
			count++;
			System.out.println((count)+" "+line);
		}
		
		br.close();
		fr.close();
	}

}

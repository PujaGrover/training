package com.veritis.j2se.demos.oops.io;

import java.io.File;
import java.io.FileInputStream;


public class FileInputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
//		FileReader s = new FileReader(
//				"/Users/Mokshagna/Desktop/Bank.java");
//		BufferedReader br = new BufferedReader(s);
//
//		String temp;
//		int i = 0;
//		while ((temp = br.readLine()) != null) {
//
//			System.out.println((++i) + " " + temp);
//		}
//		br.close();
//		s.close();
		File f=new File("/Users/Mokshagna/Desktop/Venkata_Training_2k12_latest/Venkata_Training_2k12_latest/1.J2SE Videos/Practice/J2seDemos/src/com/veritis/j2se/demos/oops/Banks.java");
		FileInputStream file=new FileInputStream(f);
//		int temp;
//		int i=1;
//		System.out.print(i+" ");
//		while((temp=file.read())!=-1){
//			char content=(char)temp;
//			System.out.print(content);
//			if(content=='\n'){
//				i++;
//				System.out.print(i+" ");
//			}
//		}
		
		int size=file.available();
		byte b[]=new byte[size];
		file.read(b);
		for(int i=0;i<b.length;i++){
			System.out.print((char)b[i]);
		}
	}

}

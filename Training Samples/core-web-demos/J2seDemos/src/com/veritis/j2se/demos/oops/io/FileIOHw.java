package com.veritis.j2se.demos.oops.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileIOHw {

	public static void main(String[] args) throws Exception{
		//File f=new File("C:\\","shirin.jpg");
		FileInputStream in = new FileInputStream("c:\\venkata.jpg");
		FileOutputStream out = new FileOutputStream("c:\\techmagix.jpg");
		
		int size = in.available();
                System.out.println("image has "+size+" bytes");

                byte b[]=new byte[size];
                in.read(b); // Reading from Sunset.jpg into b[]
		out.write(b); // writing into bhargavi.jpg from b[]
//		for (int i=0; i < size; i++){
//			out.write(in.read());
//		}
//		out.close();

	}

}

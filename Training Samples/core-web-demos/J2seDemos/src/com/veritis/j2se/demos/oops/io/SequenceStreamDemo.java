package com.veritis.j2se.demos.oops.io;

import java.io.*;
import java.util.*;

/*class InputStreamEnumerator implements Enumeration
{
 private Enumeration files;

 public InputStreamEnumerator(Vector files)
 {
 this.files=files.elements();
 }

 public boolean hasMoreElements()
 {
 return files.hasMoreElements();
 }

 public Object nextElement()
 {
 try
 {
 return new FileInputStream(files.nextElement().toString());
 }
 catch(Exception e)
 {
 return null;
 }
 }
 }
*/


 class SequenceStreamDemo
 {
 public static void main(String args[]) throws Exception 
 {
 int c;
 //Vector files=new Vector();
 FileInputStream f1=new FileInputStream("/Users/Mokshagna/Desktop/filedemo/chardemo.txt");
 FileInputStream f2=new FileInputStream("/Users/Mokshagna/Desktop/filedemo/bytedemo.txt");
 
 /*
*/
 //files.add(f1);
 //files.add(f2);
 //InputStreamEnumerator e=new InputStreamEnumerator(files);
 //InputStream input=new SequenceInputStream(files.elements());
 SequenceInputStream input=new SequenceInputStream(f1,f2);

 while((c=input.read())!= -1)
 {
 System.out.print((char) c);
 }
     System.out.println("");
 input.close();
}
}


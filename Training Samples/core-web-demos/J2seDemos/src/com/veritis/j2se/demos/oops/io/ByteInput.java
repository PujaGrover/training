package com.veritis.j2se.demos.oops.io;

import java.io.ByteArrayInputStream;


class ByteInput
{
  public static void main(String args[])
  {
  String str="aptech \n niit \n lcc \n ssi \n cmc \n biit \n stg \n polaris";
  byte b[]=str.getBytes();
  
  ByteArrayInputStream f=new ByteArrayInputStream(b);
  int size=f.available();
  System.out.println("size of the file in  bytes :--> " +size);

//  for(int i=0;i<size;i++)
//  {
//  System.out.print((char)f.read());
//  }
  int temp=0;
  while((temp=f.read()) > 0){
	  System.out.print((char)temp);
  }


}
}
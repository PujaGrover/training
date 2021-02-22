package com.veritis.j2se.demos.oops.io;

import java.io.*;

class PipedStreamDemo
{
  public static void main(String args[])
  {
try
{

  final PipedOutputStream out=new PipedOutputStream();
  
  
  final PipedInputStream in=new PipedInputStream(out);

   final  BufferedOutputStream bo=new BufferedOutputStream(out);
    final  BufferedInputStream  bi=new BufferedInputStream(in);

      final  DataOutputStream dos=new DataOutputStream(bo);
      final  DataInputStream dis=new DataInputStream(bi);

  dos.writeInt(10);
  dos.writeInt(45);
  dos.flush();
  System.out.println("data written");
  System.out.println(dis.readInt());
  System.out.println(dis.readInt());
 }
 catch(Exception e)
 {
 System.out.println("error :->  " +e);
 }


}
}

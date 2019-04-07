/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author vsaranu
 */
public class VectorDemo {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String args[]){
    Vector v=new Vector(10);
    System.out.println("The Size and capcity of vector are"+v.size()+"  "+v.capacity());
    v.add(new Integer(50)); // jdk1.4
    v.add(100);
    v.add(200);
    v.add(300);
    v.add(400);
    v.add(500);
    v.add(600);
    v.add(700);
    v.add(800);
    v.add(900);
    v.add(1000);
    
    System.out.println("The Size and capcity of vector are"+v.size()+"  "+v.capacity());
    v.add(1200);
    v.add(1300);
    v.add(1400);
    v.add(1500);
    v.add(1600);
    v.add(1700);
    v.add(1800);
    v.add(1900);
    v.add(2000);
    v.add(2100);
    
    System.out.println("The Size and capcity of vector are"+v.size()+"  "+v.capacity());
    Vector arr=new Vector();
    arr.add(2000);
    arr.add(2100);
    arr.add(1900);
    v.removeAll(arr);
    System.out.println("The Size and capcity of vector are"+v.size()+"  "+v.capacity());
   Enumeration e=v.elements();
   while(e.hasMoreElements()){
       int temp=(Integer)e.nextElement();
      
       System.out.print(temp+",");
   }
   System.out.println("\nUsing enhanced for loop");
  int  i=-1;
    for (Object object : v) {
    	 i++;
        int temp1=(Integer)object;
        System.out.print(temp1+",");
        if(temp1 == 1500){
        v.remove(i);
        }
    }
    //System.out.println(v);
}
}

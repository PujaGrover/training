/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.io;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;


/**
 *
 * @author vsaranu
 */
public class Read {


public static void main(String[]args)throws Exception
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("enter a");
          int a=Integer.parseInt(br.readLine());
          System.out.println("enter b");
          int b=Integer.parseInt(br.readLine());
          System.out.println("result is :"  +(a*b));

}
}


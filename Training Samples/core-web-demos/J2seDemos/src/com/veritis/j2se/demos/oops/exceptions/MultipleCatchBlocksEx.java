package com.veritis.j2se.demos.oops.exceptions;

import java.util.Scanner;

public class MultipleCatchBlocksEx {

	/**
	 * @param args
	 */
	public static void s(Object str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		int a,b;
		int k[]={10,20,30};
		Scanner scan=null;
		String str="abc";
		try{
			s("Enter a value");
			scan=new Scanner(System.in);
			a=scan.nextInt();
			s("Enter b value");
			b=scan.nextInt();
			s("The division is "+(a/b));
			s("k[2] = "+k[2]);
			s("String lenth is "+str.length());
			int c=Integer.parseInt(str);
			s("addition of all values "+(a+b+c));
			
		}
		
		catch(ArithmeticException e){
			s("Division with zero is not possible");
			//s(e.getMessage());
			//e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			s("k[3] is not located");
		}
		catch(NullPointerException e){
			s("Don't use null objects to do operation please check the null objects");
		}catch(Exception e){
			//s(e);
			e.printStackTrace();
		}
		
		
		finally{
			s("We are inside the finally block");
			scan.close();
		}
		
		s("This is after catch");
		s("Have a good day");
	}

}

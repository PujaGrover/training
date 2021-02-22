package com.veritis.j2se.demos.newfeatures;

public class NewForLoop {

	public static void main(String[] args) {
		int a[]=new int[]{10,20,30,40,50};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("Enhanced for loop");
		for(int k:a){
			System.out.println(k);
		}
	}

}

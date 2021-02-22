package com.veritis.j2se.demos.newfeatures;

import java.util.ArrayList;

public class EnhanceForLoopDemo {
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
	ArrayList list=new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30.45);
	list.add(40.564f);
	list.add(true);
	list.add((byte)123);
	for(Object object:list){
		//System.out.println(object.getClass().getName());
		int k=(Integer)object;
		System.out.println(k);
	}
	
	
	}

}

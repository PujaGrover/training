package com.veritis.j2se.demos.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add((int) 2.345f);
		//list.add("venkata");
		
		List<Number> numberList=new ArrayList<Number>();
		
		numberList.add(10);
		numberList.add(10.55434f);
		numberList.add(10323434334L);
		//numberList.add("10");
		
		
		List<Object> numbers=new ArrayList<Object>();
		numbers.add(10);
		numbers.add(2.345f);
		numbers.add(3.4);
		numbers.add("Venkata");
	
	}

}

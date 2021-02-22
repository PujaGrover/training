package com.veritis.j2se.demos.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(100);
		list.add("emp");
		list.add(2.3435);
	String str=(String)list.get(0);
	}

}

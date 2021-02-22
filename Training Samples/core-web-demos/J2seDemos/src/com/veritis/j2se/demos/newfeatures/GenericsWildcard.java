package com.veritis.j2se.demos.newfeatures;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsWildcard {

	static void printCollection(Collection<? extends Number> c) {
		for (Object o : c)
			System.out.println(o);
	}

	public static void main(String[] args) {
		

		ArrayList<Integer> a = new ArrayList<>(10);
		a.add(10);
		a.add(20);
		a.add(30);
		printCollection(a);
		ArrayList<Long> l = new ArrayList<Long>();
		l.add(10L);
		l.add(20L);
		l.add(30L);
		printCollection(l);
		ArrayList<String> s = new ArrayList<String>();
		s.add("Venkata");
		s.add("Saranu");
		//printCollection(s);
		ArrayList<Number> s2 = new ArrayList<>(10);
	}

}
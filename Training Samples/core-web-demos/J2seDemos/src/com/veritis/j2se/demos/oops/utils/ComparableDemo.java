package com.veritis.j2se.demos.oops.utils;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Emp e1=new Emp(101,"Xyz","task1");
	Emp e2=new Emp(107,"pqr","task11");
	Emp e3=new Emp(106,"abc","task11");
	Emp e4=new Emp(104,"mno","task12");
	Emp e5=new Emp(102,"xvu","task14");
	Emp e6=new Emp(105,"abd","task15");
	Emp e7=new Emp(103,"pql","task16");
	ArrayList list=new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	list.add(e6);
	list.add(e7);
	Collections.sort(list);
	for(Object object:list){
		System.out.println(object);
	}
}
}

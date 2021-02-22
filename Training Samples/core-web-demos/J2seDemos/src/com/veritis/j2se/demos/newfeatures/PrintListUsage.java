package com.veritis.j2se.demos.newfeatures;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RajithaVenkat
 */
public class PrintListUsage {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(100);
		list.add(1002);
		list.add(1230);
		list.add(1045);
		PrintList<Integer> print = new PrintList<Integer>();
		print.addCollection(list);
		print.printColletion();

		ArrayList<Emp> emps = new ArrayList<Emp>();
		Emp e1 = new Emp(111, "Venkata", " Saranu", "Software");
		Emp e2 = new Emp(222, "Kasar", "prabath", "Sr Software ");
		Emp e3 = new Emp(333, "Mohan", "saranu", "Software Architect");
		Emp e4 = new Emp(444, "Krishna", "Mohan", "DBA");
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);

		PrintList<Emp> printemps = new PrintList<>();
		printemps.addCollection(emps);
		printemps.printColletion();

	}
}

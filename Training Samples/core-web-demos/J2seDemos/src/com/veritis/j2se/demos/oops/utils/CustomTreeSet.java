package com.veritis.j2se.demos.oops.utils;

import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Set set=new TreeSet();
		Emp e;
        e=new Emp();
        e.setEmpno(111);
        e.setEname("Venkata");
        e.setDesig("Software");
        //System.out.println("Value of e ="+e);
        set.add(e);
        e=new Emp(101,"saranu","software");
        set.add(e);
        e=new Emp(234,"xxxx","Design");
        set.add(e);
        
        e=new Emp(987,"yyyy","software");
        set.add(e);
        e=new Emp(123,"xxxx","Design");
        set.add(e);
        e=new Emp(109,"nnnnnn","software");
        set.add(e);
        e=new Emp(765,"aaaa","Design");
        set.add(e);
        e=new Emp(110,"nnnnnn","software");
        set.add(e);
        
        for(Object obj:set){
        	Emp emp=(Emp)obj;
        	System.out.println(emp);
        }
	}

}

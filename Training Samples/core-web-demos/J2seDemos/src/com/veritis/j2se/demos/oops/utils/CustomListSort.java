/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author RajithaVenkat
 */
public class CustomListSort {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
        ArrayList list=new ArrayList();
        Emp e;
        e=new Emp();
        e.setEmpno(111);
        e.setEname("Venkata");
        e.setDesig("Software");
        //System.out.println("Value of e ="+e);
        list.add(e);
        e=new Emp(101,"saranu","software");
        list.add(e);
        e=new Emp(234,"xxxx","Design");
        list.add(e);
        
        e=new Emp(987,"yyyy","software");
        list.add(e);
        e=new Emp(123,"xxxx","Design");
        list.add(e);
        e=new Emp(109,"nnnnnn","software");
        list.add(e);
        e=new Emp(765,"aaaa","Design");
        list.add(e);
        e=new Emp(110,"nnnnnn","software");
        list.add(e);
        
        System.out.println("List of Employees are "+list);
        System.out.println("After Sorting");
   // Collections.sort(list,new EmpNoSorter());
        Collections.sort(list,new NameSorter());
        System.out.println("List of Employees are "+list);
        for (Object object : list) {
            Emp emp=(Emp)object;
            System.out.println(emp);
        }
    }
}

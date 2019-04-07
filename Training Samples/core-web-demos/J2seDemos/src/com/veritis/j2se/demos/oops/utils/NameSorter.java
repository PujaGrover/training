/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.Comparator;

/**
 *
 * @author RajithaVenkat
 */
@SuppressWarnings("rawtypes")
public class NameSorter implements Comparator{
    public int compare(Object o1, Object o2) {
        Emp e1=(Emp)o1;
        Emp e2=(Emp)o2;
       
        String desg1=e1.getDesig();
    	String desg2=e2.getDesig();
    	
        if(desg1.equals(desg2)){
        	 String name1=e1.getEname();
             String name2=e2.getEname();
             if(name1.equals(name2)){
            	 int empno1=e1.getEmpno();
            	 int empno2=e2.getEmpno();
            	 return empno1-empno2;
             }else{
            	 return (name1.compareTo(name2));
             }
        }
        else{
        	return (desg1.compareTo(desg2));
        }
    }

}

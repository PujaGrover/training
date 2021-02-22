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
public class EmpNoSorter  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		return e2.getEmpno()-e1.getEmpno();
	}

   

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author vsaranu
 */
public class TreeSetDemo {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]){
        Set set;
        set=new TreeSet();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(101);
        set.add(105);
        set.add(103);
        set.add(106);
        set.add(102);
        set.add(104);
        set.add(101);
        set.add(105);
        set.add(103);
        System.out.println("The Size of set is "+set.size());
        System.out.println("The Set Object"+set);
        for (Object object : set) {
            int k=(Integer)object;
            System.out.print(k+",");
        }
        System.out.println("");
    }

}

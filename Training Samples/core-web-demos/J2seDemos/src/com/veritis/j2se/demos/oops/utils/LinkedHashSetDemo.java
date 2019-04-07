/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.LinkedHashSet;

/**
 *
 * @author vsaranu
 */
public class LinkedHashSetDemo {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
        LinkedHashSet set =new LinkedHashSet();
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
        //Iterator it=set.iterator();
        System.out.println("The Set Object"+set);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vsaranu
 */
public class HashSetDemo {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]){
        HashSet set=new HashSet();
        set.add(new Integer(100));
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
        Iterator it=set.iterator();
        System.out.println("The Set Object"+set);
        for (Object object : set) {
            int k=(Integer)object;
            System.out.println(k);
           // if(k==300)
             //   set.remove(k);
        }
        while (it.hasNext()){
            int p=(Integer)it.next();
            if(p==300)
                it.remove();
        }
        System.out.println(set);
    }

}

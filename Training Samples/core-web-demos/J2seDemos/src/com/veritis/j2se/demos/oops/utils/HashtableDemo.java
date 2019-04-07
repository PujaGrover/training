/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author vsaranu
 */
public class HashtableDemo {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String args[]){
     Map map=new Hashtable();
        map.put("one",20);
        map.put("two", 10);
        map.put("three",40);
        map.put("five", 30);
        map.put("six", 50);
        map.put("seven", 60);
     map.put(null,50);
        System.out.println("Hashtable---->"+map);

         map=new HashMap();
        map.put("one",20);
        map.put("two", 10);
        map.put("three",40);
        map.put("five", 30);
        map.put("six", 50);
        map.put("seven", 60);
        map.put(null,70);
        System.out.println("HashMap------>"+map);
        
        Set keys=map.keySet();
        for(Object obj:keys){
        	String key=(String)obj;
        	System.out.println(map.get(key));
        }
}
}

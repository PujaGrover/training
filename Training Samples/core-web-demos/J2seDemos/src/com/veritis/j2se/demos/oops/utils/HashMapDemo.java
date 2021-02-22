/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author vsaranu
 */
public class HashMapDemo {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]){
        HashMap map=new HashMap();
        map.put("one",10);
        map.put("two", 10);
        map.put("three",10);
        map.put("four", "Venkat");
        map.put("five", 2.3435);
        map.put("five", 1000);
        map.put(null, "wer");
        System.out.println(map.size() + "  "+ map);

        Set keys=map.keySet();
       // System.out.println("The keys are "+ ss);
        Iterator it=keys.iterator();
        while(it.hasNext()){
            String key=(String)it.next();
            System.out.println(key +" = "+map.get(key));
        }
        System.out.println("Using Enhanced For Loop");
        for(Object keyObj:keys){
        		String key = (String) keyObj;
        		System.out.println(key +" = "+map.get(key));
        }
        System.out.println("Using Entry Set");
        Set<Entry> entries = map.entrySet();
        for(Entry entryObj:entries){
        		System.out.println(entryObj.getKey() +" = "+entryObj.getValue());
        }

        map=new LinkedHashMap();
        map.put(20, 50);
         map.put("five", 2.3435);
        map.put("five", 1000);
        map.put("one",10);
        map.put("two", 10);
        map.put("three",10);
        map.put("foxur", "Venkat");
       
        System.out.println(map.size() + "  "+ map);
//        Set s=map.keySet();
//        Iterator it=s.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(map.get(it.next()));
//        }
    }

}

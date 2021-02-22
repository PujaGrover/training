/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author vsaranu
 */
public class TreeMapDemo {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String args[]){
     Map map=new TreeMap();
        map.put("one",20);
        map.put("two", 10);
        map.put("three",40);
        map.put("four", 90);
        map.put("five", 30);
        map.put("six", 50);
       // map.put(20, 60);
      //  map.put(null, 50);
        System.out.println(map);
}
}

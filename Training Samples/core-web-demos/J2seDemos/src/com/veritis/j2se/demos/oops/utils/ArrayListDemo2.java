/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vsaranu
 */
public class ArrayListDemo2 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]){
    	
    	
    	
    	//Float xxxxx=100f;
    	//System.out.println(xxxxx.hashCode());
        Person p;
        p=new Person();
        p.setFirstName("Venkata");
        p.setLastName("Saranu");
//        System.out.println("Venkata Person"+p.hashCode());
        //System.out.println(p.);
        ArrayList list=new ArrayList();
        
        list.add(p);
        p=new Person();
        p.setFirstName("Shiva");
        p.setLastName("Balusu");
//        System.out.println("Shiva Person"+p.hashCode());
        list.add(p);
        p=new Person();
        p.setFirstName("Srikanth");
        p.setLastName("Kari");
//        System.out.println("Srikanth Person"+p.hashCode());
        list.add(p);
        p=new Person();
        p.setFirstName("Kireet");
        p.setLastName("Pola");
//        System.out.println("Kiran Person"+p.hashCode());
        list.add(p);
        System.out.println("The List is "+list);
        int count =0;
        for (int i=0;i<list.size();i++) {
            
            Person pers=(Person)list.get(i);
            System.out.println( (++count ) +" - Person Details are ------------");
            System.out.println(pers.getFirstName());
            System.out.println(pers.getLastName());
        }
        //Collections.sort(list);
    }

}
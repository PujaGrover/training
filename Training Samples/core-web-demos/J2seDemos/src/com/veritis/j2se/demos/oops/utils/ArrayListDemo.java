/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vsaranu
 */
public class ArrayListDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]){
        List list=new ArrayList();
        System.out.println("List is Empty "+list.isEmpty());
        list.add(new Integer(10)); //jdk1.4 or
        list.add(20); //Auto Boxing
        System.out.println("The size of the list "+list.size()+ "  "+list);
        ArrayList list1=new ArrayList();
        list1.add(100);
        list1.add(200);
        list1.add(900);
        list1.add(800);
        list1.add(500);
        list1.add(600);
        list1.add(1000);
        list1.add(200);
        list1.add(400);
        list1.add(300);
        list1.add(800);
        list1.add(600);
        System.out.println("the size of List1 "+list1.size()+ "  "+list1);
        list.addAll(1,list1);


        System.out.println("The size of the list "+list.size()+"  "+list);
        Iterator it=list.iterator();
        while(it.hasNext()){
            int k=(Integer)it.next();
            if(k==200)
                it.remove();
            System.out.println(k);
        }
        System.out.println("After remove() "+list);
        
       Collections.sort(list);
        System.out.println("After Sort "+list);
        Collections.shuffle(list);

        System.out.println("After Shuffle "+list);
        System.out.println(Collections.max(list));
        Collections.reverse(list);
        System.out.println("After reversing "+list);
        Collections.synchronizedList(list);
        int i=-1;
        for(Object p:list){
        	i++;
        	int k=(Integer)p;
        	if(k==600)
        		list.remove(i);
        	System.out.println((int)p);
        }
    }

}

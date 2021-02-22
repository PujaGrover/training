/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.LinkedList;

/**
 *
 * @author vsaranu
 */
public class LinkedListDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]){
       LinkedList l=new LinkedList();
       l.add(50);
      l.addFirst(100);
       l.add(200);
       l.add(300);
       l.add(400);
       l.add(500);
       l.addLast(1000);
       l.add(1001);
        System.out.println("Last Object is "+l.getLast());
        System.out.println("The Linked List is "+l);
        System.out.println("the l.peek() "+l.peek());
       System.out.println(" After l.peek() the List is ");
       for(Object o:l)
           System.out.println(o);
        System.out.println("the l.poll() "+l.poll());
       System.out.println("After l.poll() the list is ");
       for(Object o:l)
           System.out.println(o);
        System.out.println("First "+l.getFirst());
       System.out.println("Last "+l.getLast());
    }

}

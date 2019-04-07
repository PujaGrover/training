package com.veritis.j2se.demos.newfeatures;
import java.util.Collection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RajithaVenkat
 */
public class PrintList<E>{
    Collection<E> collection;
    public void addCollection(Collection<E> c){
        collection=c;
    }
    public void printColletion(){
        for (E object : collection) {
            System.out.println(object);
        }
    }

}

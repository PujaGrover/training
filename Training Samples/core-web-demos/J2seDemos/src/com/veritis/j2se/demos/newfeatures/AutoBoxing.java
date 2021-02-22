/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.newfeatures;

/**
 *
 * @author RajithaVenkat
 */
public class AutoBoxing {
    public static void main(String[] args) {
        int k=10;
        int p=20;
        Integer obj=new Integer(k); // 1.4
        Integer obj1=p;
        System.out.println((obj.intValue()+obj1.intValue()));
        System.out.println((obj+obj1));

    }
}

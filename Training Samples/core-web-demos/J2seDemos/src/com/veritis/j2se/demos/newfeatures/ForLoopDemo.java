/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.newfeatures;

/**
 *
 * @author RajithaVenkat
 */
public class ForLoopDemo {
    public static void main(String[] args) {
           String str[]={"Venkata","Saranu","Infoware","Veritis","BCBS"};
           for(int i=0;i<str.length;i++){
        	   System.out.println(str[i]);
           }
           System.out.println("-----------------Enhanced For Loop-----------------");
        for (String temp : str) {
            System.out.print(temp+" ");
        }
        System.out.println("");
    }
}

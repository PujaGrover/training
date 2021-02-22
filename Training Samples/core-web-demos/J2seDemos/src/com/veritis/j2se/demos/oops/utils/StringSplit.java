/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

/**
 *
 * @author RajithaVenkat
 */
public class StringSplit {
    public static void main(String[] args) {
        String str="192.168.1.111";
         String string="";
        String arr[]=str.split("\\.");
        for (String stri : arr) {
            System.out.println(stri);
        }
        int k=Integer.parseInt(arr[arr.length-1]);
        k++;
       
        for (int i = 0; i < arr.length-1; i++) {

            string+=arr[i]+".";

        }
        string+=k;
        System.out.println ("new ip is "+string);
    }
    
}

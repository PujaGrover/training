/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.StringTokenizer;

/**
 *
 * @author vsaranu
 */
public class StringTokenizingDemo {
    public static void main(String[] args) {
        String str="int a,b,c;float d,e,f;";
    StringTokenizer st=new StringTokenizer(str, " ,;");
       // System.out.println("no of tokens "+st.countTokens());
    while(st.hasMoreTokens())
    {
        System.out.println(st.nextToken());
    }
    }

}

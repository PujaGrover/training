/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author vsaranu
 */
public class DateDemo {
    public static void main(String args[]){
        Date d=new Date();
        System.out.println("Date Object : "+d);
//        GregorianCalendar c=new GregorianCalendar();
//        System.out.println(c.getTimeZone());
//         String DATE_FORMAT_NOW = "dd-MMM-yyyy";
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(d)+" And time is : "+sdf1.format(d));
        System.out.println(System.currentTimeMillis());
        
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println(c.getTime());
       
        
       

    }

}

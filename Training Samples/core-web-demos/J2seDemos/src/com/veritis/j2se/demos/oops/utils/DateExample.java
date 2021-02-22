/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author RajithaVenkat
 */
public class DateExample {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
         String DATE_FORMAT_NOW = "MM-dd-yyyy 'T' hh:mm:ss";
      //  Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
       // SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(d) );
        
        String dateStr="06/23/2016";
        
        SimpleDateFormat dateFmt=new SimpleDateFormat("MM/dd/yyyy");
        Date newDate=dateFmt.parse(dateStr);
        System.out.println("New Date is "+newDate);
    }
}

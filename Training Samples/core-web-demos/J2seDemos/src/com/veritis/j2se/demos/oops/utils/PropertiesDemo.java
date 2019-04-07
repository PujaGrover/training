/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author RajithaVenkat
 */
public class PropertiesDemo {
    public static void main(String[] args)  throws Exception{
       Properties props=new Properties();
       props.load(new FileInputStream("src/com/veritis/j2se/demos/properties/db.properties"));
        System.out.println("Driver Name : "+props.getProperty("driver"));
        System.out.println("URL is      : "+props.getProperty("url"));
        System.out.println("User name is: "+props.getProperty("username"));
        System.out.println("Password is : "+props.getProperty("password"));
        FileOutputStream fos=new FileOutputStream("/Users/Mokshagna/Desktop/filedemo/sageit-solution.xml");
        props.storeToXML(fos, "This is DB XML");
    }
}

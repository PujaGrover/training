/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.newfeatures;

/**
 *
 * @author RajithaVenkat
 */
class Sample{

    public int add(int... numbers){
        int addition=0;
        for (int i : numbers) {
            addition+=i;
        }
        return addition;
    }
  
}
public class VarArgsDemo {
    public static void main(String[] args) {
        Sample s=new Sample();
        //System.out.println(s.add(10,20,30,234,234,32,23434,234,343234,23423));
        System.out.println(s.add(10,20,30));
        System.out.println(s.add(10,20,30,401));
        System.out.println(s.add(10,20,30,40,50,60,32,23,434,343,31,123,5,5345,253));
    }
}

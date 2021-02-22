package com.veritis.j2se.demos.oops.utils;

import java.util.HashMap;
import java.util.Map.Entry;

public class EntrySetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		   HashMap map=new HashMap();
	        map.put("one",10);
	        map.put("two", 10);
	        map.put("three",10);
	        map.put("four", "Venkat");
	        map.put("five", 2.3435);
	        map.put("five", 1000);
	        map.put(null, "wer");
	        
	        for(Object obj:map.entrySet()){
	        	Entry e=(Entry)obj;
	        	System.out.println(e.getKey() +" = "+e.getValue());
	        }

	}

}

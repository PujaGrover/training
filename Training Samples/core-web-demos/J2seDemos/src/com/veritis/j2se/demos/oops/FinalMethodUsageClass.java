package com.veritis.j2se.demos.oops;

import java.lang.ref.WeakReference;

public class FinalMethodUsageClass {
	FinalMethodClass finalMethodClass;
	public FinalMethodUsageClass() throws Exception {
		finalMethodClass=new FinalMethodClass();
	}
	public void display(){
		finalMethodClass.show();
	}
	
}

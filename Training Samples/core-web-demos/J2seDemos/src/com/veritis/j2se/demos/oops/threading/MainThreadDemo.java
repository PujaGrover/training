package com.veritis.j2se.demos.oops.threading;

public class MainThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread mainThread=Thread.currentThread();
		System.out.println(mainThread); // Thread[name,priority,threadgroup]
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			
		}
		System.out.println("After the sleep time ");
		mainThread.setName("Veritis");
		System.out.println(mainThread); // Thread[Veritis,5,main]
		mainThread.setPriority(Thread.MAX_PRIORITY-3);
		System.out.println(mainThread); // Thread[Veritis,7,main]
		System.out.println(mainThread.getName());
	}

}

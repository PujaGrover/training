package com.veritis.j2se.demos.oops.threading;

class ResourceClass{
	public  void printString(String str){
		System.out.print("["+str);
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			
		}
		System.out.println("]");
	}
}

class SynchThread extends Thread{
	ResourceClass resource;
	String str;
	public SynchThread(ResourceClass resource,String str) {
		super("Test "+str);
		this.resource=resource;
		this.str=str;
		start();
	}
	public void run(){
		synchronized (resource) {
			resource.printString(str);
		}
			
	
	}
}

public class SynchronizedDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ResourceClass res=new ResourceClass();
		SynchThread t1=new SynchThread(res, "Hello");
		SynchThread t2=new SynchThread(res, "java");
		SynchThread t3=new SynchThread(res, "World");

	}

}

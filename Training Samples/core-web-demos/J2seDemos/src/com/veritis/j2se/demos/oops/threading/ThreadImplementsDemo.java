package com.veritis.j2se.demos.oops.threading;

class ThreadImpl implements Runnable{
	Thread t;
	Thread t1Thread;
	public ThreadImpl() {
		// TODO Auto-generated constructor stu
	}
	public ThreadImpl(String name){
		t=new Thread(this,name);
		t.start();
	}
	
	public void run(){
		String name=t.getName();
		for(int i=1;i<=5;i++){
			System.out.println(t.getName()+" - "+i);
			try{
				if(name.equalsIgnoreCase("t1")){
				Thread.sleep(2000);
				//=Thread.currentThread();
				}
				else{
					Thread.sleep(1000);
				}
			}catch(InterruptedException e){
				
			}
			
		}
		System.out.println(t.getName()+" is exiting....");
	}
}

public class ThreadImplementsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		ThreadImpl t1=new ThreadImpl("T1");
		ThreadImpl t2=new ThreadImpl("T2");
		ThreadImpl t3=new ThreadImpl("T3");
		
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" - "+i);
			Thread.sleep(500);
		}
		//t1.t.join();
		t2.t.join();
		t3.t.join();
		System.out.println("This is main thread exited");
	}

}

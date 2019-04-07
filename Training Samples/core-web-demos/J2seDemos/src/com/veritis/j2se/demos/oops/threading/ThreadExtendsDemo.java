package com.veritis.j2se.demos.oops.threading;

class ThreadDemo extends Thread{
	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}
	public ThreadDemo(String name){
		super(name);
		System.out.println("New Born Thread "+this); //Thread[name,5,main]
		start();
	}
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(getName()+" - "+i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}
		}
	}
}

public class ThreadExtendsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1=new ThreadDemo("Hello");
		
		ThreadDemo t2=new ThreadDemo("Java");
		ThreadDemo t3=new ThreadDemo("World");
		
	}

}

package com.veritis.j2se.demos.oops.threading;

/**
 * 
 * @author vsaranu
 */
class Pit {
	int n;
	boolean flag = false;

	synchronized int get() {
		if (flag == false)
			try {
				wait();
			} catch (Exception e) {
			}

		System.out.println("got :-> " + n);
		flag = false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		if (flag == true){
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.n = n;
		flag = true;
		System.out.println("put :-> " + n);
		notify();

	}
}

class Producer implements Runnable {
	Pit p;
	Thread t;

	Producer(Pit p) {
		this.p = p;
		t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			p.put(++i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class Consumer implements Runnable {
	Pit p;

	Consumer(Pit p) {
		this.p = p;
		new Thread(this, "Consumer").start();
	}

	public void run() {

		while (true) {
			p.get();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class WaitNotifyDemo {
	public static void main(String args[]) {
		Pit p = new Pit();
		new Producer(p);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		new Consumer(p);

		System.out.println("press ctrl+c to stop");
	}
}

package com.veritis.j2se.demos.oops.threading;

/**
 *
 * @author vsaranu
 */
class a {
	synchronized void foo(b ball) {
		String name = Thread.currentThread().getName();
		System.out.println("entered a.foo");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("interrupted a");
		}

		System.out.println("a.foo() - trying to call b.last()");
		ball.last();
	}

	synchronized void last() {
		System.out.println("inside a.last()");
	}
}

class b {
	synchronized void bar(a ant) {
		String name = Thread.currentThread().getName();
		System.out.println("enetered b.bar");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("interrupted b");
		}

		System.out.println("b.bar() -  trying to call a.last()");
		ant.last();
	}

	synchronized void last() {
		System.out.println("inside b.last()");
	}
}

public class Deadlock implements Runnable {
	a ant = new a();
	b ball = new b();

	Deadlock() {
		Thread.currentThread().setName("main thread");
		Thread t = new Thread(this, "racing thread");
		t.start();
		ant.foo(ball);
		System.out.println("back in the main");

	}

	public void run() {
		ball.bar(ant);
		System.out.println("back in tje other thread");
	}

	public static void main(String args[]) {
		new Deadlock();
	}
}

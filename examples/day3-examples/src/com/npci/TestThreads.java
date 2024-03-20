package com.npci;

class X implements Runnable {
	private static int ticket = 2;
	@Override
	public void run() {
		test();
	}
	public synchronized void test() {
		Thread t = Thread.currentThread();
		String name = t.getName(); // returns the thread name
		if(ticket > 0) {
			System.out.println(name+" congrats you got the ticket");
			ticket--;
		} else {System.out.println(name+" sorry you did not get the ticket");}
	}
}
public class TestThreads {
	public static void main(String[] args) {
		X x1 = new X();
		Thread t1 = new Thread(x1, "Thread1"); // 2nd parameter is optional which is a thread name
		Thread t2 = new Thread(x1, "Thread2"); // by default thread name starts as Thread-0
		Thread t3 = new Thread(x1, "Thread3");
		Thread t4 = new Thread(x1, "Thread4");
		t1.start(); // t1 registers in the thread scheduler but it may not get the CPU time immediately
		t2.start(); // t2 also registers in the thread scheduler
		t3.start();
		t4.start();
	}
}

package Concurrency;

public class ThreadSample extends Thread{
	String y;
	public ThreadSample(String x) {
		y = x;
	}
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print(y);
		}
	}

}

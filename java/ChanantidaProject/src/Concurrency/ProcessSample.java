package Concurrency;

public class ProcessSample {
	public void printName(String x) {
		for (int i = 0; i<100; i++) {
			System.out.println(x);
		}
	}

}

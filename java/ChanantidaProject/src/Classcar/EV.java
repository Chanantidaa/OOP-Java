package Classcar;

public class EV extends Car{
	public void start() {
		System.out.println("Override from car");
	}
	public void start(String x, int y) {
		System.out.println(x);
		System.out.println(y);
		System.out.println("This is Overload");
	}
	public int start(int a, int b) {
		int r;
		r = a+b;
		System.out.println("r = "+r);
		return r;
	}

}

package javaexamples;

public class New {
	int b= 20;
			static int empid=10;
	public void m1() {
		int a=10;
		System.out.println("m1 executed");
		System.out.println(a);
	}
	public void m2() {
		System.out.println("m2 executed");
		System.out.println(b);
	System.out.println(empid);
	
	}
	public void m3() {
		System.out.println("m3 executed");
		System.out.println(b);
		System.out.println(empid);
	}
	public static void main(String args[]) {
		System.out.println("main method executedd");
		New m= new New();
		m.m1();
		m.m2();
		m.m3();
	}

}

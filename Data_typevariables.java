package javaexamples;

public class Data_typevariables {
	int b=100;
	static int empid=90;
	
	
	public void m1() {
			int a=50;
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
		System.out.println("main function ececuted");
		Data_typevariables m=new Data_typevariables();
		m.m1();
		m.m2();
		m.m3();
		
		
		

	}
	}



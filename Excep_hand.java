package javaexamples;

public class Excep_hand {
	public static void main(String args[]) {
		
			int a[]= {10,20,30,40,50,60};
			try {
			System.out.println(a[2]);
		}
		catch(Exception e) {
			System.out.println(e);
			
			}
		finally {
			System.out.println("Finally statement executed");
			System.out.println(a[1]);
		}
	}

}

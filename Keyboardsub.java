package javaexamples;
import java.util.Scanner;
public class Keyboardsub{
	public static void main(String args[]) {
		int a,b,c;
		System.out.println("Enter a & b values");
		Scanner m= new Scanner(System.in);
		a=m.nextInt();
		b=m.nextInt();
		c=a-b;
		System.out.println("subtraction =" +c);
	}
}

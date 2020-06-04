package javaexamples;
import java.util.Scanner;
public class Switch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("Enter first number");
		int a= sc.nextInt();
		System.out.println("Enter second number");
		int b= sc.nextInt();
		System.out.println("Enter your choice");
		int Ch= sc.nextInt();
		switch(Ch){
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
				default:
					System.out.println("invalid choice");
					
		}
	}

}

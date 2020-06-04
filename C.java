package javaexamples;

	 class A{
			int a=50;
			int b=60;
			public void IDE(){
			System.out.println("IDE");
			}
			}
			class B extends A{
			int x=70;
			int y=80;
			public void RC(){
			System.out.println("RC");
			System.out.println(a+b); 
			}
			}
			public class C extends B{
			public void WD(){
			System.out.println("WD");
			System.out.println(x+y); 
			System.out.println(a+b); 
			}
			public static void main(String args[]){
			C obj = new C();
			obj.IDE(); 
			obj.RC(); 
			obj.WD();
			}
			}
		
	
		
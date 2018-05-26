package may23;

import java.util.Scanner;

public class Test {
	 
	
	public static void main(String[] args) {
	
String x = "aaaa";
int a = 8;

System.out.println(x+a);


System.out.println(x.length());



// call Instance method
int integer=0;

	Test integer1 = new Test();
	integer= integer1.Instance(integer);
	System.out.println(integer);
	
	
	//call static method
	
	 integer=static1(integer);
		System.out.println(integer);

	}
	
	// Instance method
	  int Instance(int x) {

		System.out.println("Enter the integer");
		
			Scanner scan = new Scanner (System.in);
			x = scan.nextInt();
			
			 System.out.println("the Instance method");
			return x;
			
		    }

// static method
	
	static int static1(int x) {

		System.out.println("Enter the integer");
		
			Scanner scan = new Scanner (System.in);
			x = scan.nextInt();
			
			 System.out.println("the static method");
			return x;
			 
		    }
	
	 

}

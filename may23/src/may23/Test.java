package may23;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	
String x = "aaaa";
int a = 8;
System.out.println(x+a);

Scanner scan = new Scanner (System.in);
System.out.println(x.length());
System.out.println("Enter the integer");

int integer = scan.nextInt();
testfun(integer);




scan.close();

	}
	public static void testfun (int x) {
	    
		System.out.println(x);
	    }

}

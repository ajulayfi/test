package may23;

import java.util.Scanner;

public class Account {
	
	int a;
	int b;
	
	public void setdata(int a, int b) {
	this.a=a;
	this.b=b;
	}
	
	public void showdata() {
		System.out.println("Value of A=" +a);
		System.out.println("Value of B=" +b);
		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value of A");
		int a = scan.nextInt();
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
Account Obj = new Account();
Obj.setdata(a,b);
Obj.showdata();

scan.close();
/*Test integer1 = new Test();
int integer=0;
integer=integer1.Instance(integer);
System.out.println(integer);*/
	}

}

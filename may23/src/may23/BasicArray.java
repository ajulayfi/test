package may23;

import java.util.Scanner;

public class BasicArray {

	
		// Creates an array, fills it with various integer values, // modifies one value, then prints them out.
		public static void main(String[] args) {
		
			final int LIMIT = 4, MULTIPLE = 10;
		
			//int[] list = new int[LIMIT];
			int list[] =new int[LIMIT];
			
			int[] units = {147, 323, 89, 933, 540,
		            269, 97, 114, 298, 476};
			
		// Initialize the array values
		
			for (int index = 0; index < list.length; index++) {
		
			//	list[index] = index * MULTIPLE; 
			//list[5] = 999; 
		// change one array value // Print the array values
				System.out.println("Enter the index # " + index);
				Scanner scan = new Scanner(System.in);
				list[index]= scan.nextInt();
				
				 //System.out.print(list[index]+"  ");
				}
				for (int value : list)
		       System.out.print(value + "  ");
				System.out.println("");
				// print units Array 
				for (int value : units)
				       System.out.print(value + "  ");
				
				System.out.println("");
				System.out.println("call functions from different classes");
				System.out.println("");
				// call method
				int integer=0;
				// call Instance method

				Test integer1 = new Test();
		
				integer=integer1.Instance(integer);
		
				System.out.println(integer);
		
				// call static method
				integer=Test.static1(integer);
				
				System.out.println(integer);
		    }
		
		  }  

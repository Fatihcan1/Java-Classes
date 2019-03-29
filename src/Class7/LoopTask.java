package Class7;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) {
		// Ask user to pay for a soda
	    //keep asking user to pay for soda until entered price is not equal to 1.99
	    //after user got a write amount print "Please enjoy your soda"*/

		
		
//		double price;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("How much is the Soda?");
//		
//		price=scan.nextDouble();
//      while (price!=1.99) {
//		System.out.println("How much is the soda?");
//		price=scan.nextDouble();
//			    
//		}	   
//		   
//		System.out.println("Please enjoy your Soda");
		
//		double price;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter price");
//		price=scan.nextDouble();
//		
//		while (price!=1.99) {
//			System.out.println("enter price");
//			price=scan.nextDouble();
//			
//		}
//		System.out.println("Please enjoy your Soda");
		Scanner scan=new Scanner(System.in);
		double price;
		do {
			System.out.println("enter price");
			price=scan.nextDouble();
		}while (price!=1.99);
			System.out.println("Please enjoy your Soda");
		}
		
		
		
		
	}


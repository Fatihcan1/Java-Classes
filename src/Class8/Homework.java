package Class8;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		
		
		Scanner scan;
		
		double price;
		
		scan=new Scanner(System.in);
		
		
		
		
		do {
			System.out.println("Please pay for soda ");
			
			price=scan.nextDouble();
			System.out.println("I am inside of loop");
			
		}while (price!=1.99);
		System.out.println("I am outside of loop");
		System.out.println("Please enjoy your soda ");
	}

}

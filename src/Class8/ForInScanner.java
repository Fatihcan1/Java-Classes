package Class8;

import java.util.Scanner;

public class ForInScanner {

	public static void main(String[] args) {
		
		
		Scanner scan;
		int num1,num2;
		int largest = 0;
		
		scan=new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
		
			System.out.println("Please enter first number");

			num1 = scan.nextInt();

			System.out.println("Please enter second number");
			num2 = scan.nextInt();	
		
		
		
			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println(num1 + "is equal to " + num2);
			}

			System.out.println(largest + " is the largest");
		}
		
	}

}

package Class9;

import java.util.Scanner;

public class NestedLoopTask1 {

	public static void main(String[] args) {
		
		
//		1.  Write a program that reads a range of integers, (start and end point) 
//		provided by a user and 
//		then prints the sum of the even and odd integers.
		

		
		
		
		int num1,num2;
		int sum=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		sum=scan.nextInt();
		
		
		for  ( num1=1; num1<=num2; num1++) {
			if (num1%2==0) {
				 sum=sum+num1;	
				 System.out.println(sum);
			}
			System.out.println("Your sum is "+sum);
		} 
		
		
		
		
		
		
	}

}

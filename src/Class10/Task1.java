package Class10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input;
		int startPoint; 
		int endPoint;
		int sumEven=0;
		int sumOdd=0;
		
		input=new Scanner(System.in);
		
		System.out.println("Enter your start point");
		startPoint=input.nextInt();
		System.out.println("Enter your end point");
		endPoint=input.nextInt();
		
		if (startPoint<endPoint) {
			for (int i=startPoint; i<=endPoint; i++) {
				if (i%2==0) {
				sumEven+=i;	
				}else {
					sumOdd+=i;
				}
				System.out.println("Your sum of even numbers are: "+sumEven);
				System.out.println("Your sum of odd numbers are: "+sumOdd);
				
			}
		}		
		
	}

}

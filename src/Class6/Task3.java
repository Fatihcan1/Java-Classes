package Class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */

		Scanner scan;
		double num1,num2, result;
		char operator;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		num1=scan.nextDouble();
		System.out.println("Please enter second number");
		num2=scan.nextDouble();
		System.out.println("Please enter operator");
		operator=scan.next().charAt(0);
		
		
		switch (operator) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("Ivalid");
			result=0;
		}
		System.out.println("The result is "+result);	
	}

}

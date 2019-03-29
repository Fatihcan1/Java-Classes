package Class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */

		String grade, explanation;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		
		grade=scan.nextLine();
		
		switch (grade) {
		
		case "A":
			explanation="Exellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
			
		default:
			explanation="Not Acceptable";
			
		}
		
		System.out.println(grade+ " is "+explanation);
		
		
		
		
		
	}

}

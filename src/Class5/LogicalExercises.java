package Class5;

import java.util.Scanner;

public class LogicalExercises {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
			System.out.println("Please enter your height");	
			double height=scan.nextDouble();
			
		if (height>0 && height<=5) {
			System.out.println("You are short");
		}else if (height>5 && height<=6) {
			System.out.println("You are medium");
		}else {
			System.out.println("You are tall");
		} 		

	}

}

package Class4;

import java.util.Scanner;

public class ScannerExerciseDMV {
   public static void main(String[] args) {
	int age;
	 
	Scanner input=new Scanner(System.in);
	
	System.out.println("How old are you?");
	 age=input.nextInt();
	 
	 if(age>18) {
		 System.out.println("You are eligible to apply for Driver License");
	 }else {
		 System.out.println("You can apply for learners permit");
	 }
		
	
	
}
}

package Class5;

import java.util.Scanner;

public class LogicalExercises2 {

	public static void main(String[] args) {
		int quiz;
		int midTerm;
		int finalScore;
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your quize score");
		quiz=scan.nextInt();
		
		System.out.println("Enter your midterm score");
		midTerm=scan.nextInt();
		
		System.out.println("Enter your final score");
		finalScore=scan.nextInt();
		
	int grade=(quiz+midTerm+finalScore)/3;
	
	if (grade>=90) {
		System.out.println("Your grade is A");
	}else if (grade>=70 && grade<90) {
		System.out.println("Your grade is B");
	}else if (grade>=50 && grade<70) {
		System.out.println("Your grade is C");
	}else if (grade<50) {
		System.out.println("Your grade is F");
	}
		
		
		

	}

}

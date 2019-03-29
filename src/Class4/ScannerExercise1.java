package Class4;

import java.util.Scanner;

public class ScannerExercise1 {

	public static void main(String[] args) {
		int loanMoney;
		
		Scanner newLoan=new Scanner(System.in);
		System.out.println("How much you need? ");
		
		loanMoney=newLoan.nextInt();
		
		if(loanMoney<200000) {
			System.out.println("Approved");
		}else {
			System.out.println("Rejected");
			
		}
		
	
		
		
		
		
		

	}

}

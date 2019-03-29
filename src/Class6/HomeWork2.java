package Class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/* num1>num2 && num1>num3
		 * num2>num1 && num2>num3
		 * num3>num1 && num3>num2 
		 */
		
		int num1, num2, num3, largest;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		
		if (num1>num2) {
			    if (num1>num3) {
				       System.out.println(num1+" is the largest");
			    }else {
				       System.out.println(num3+" is the largest");
			}
		}else {
			    if (num2>num3) {
				     System.out.println(num2+" is the largest");
			     }else {
				      System.out.println(num3+" is the largest");
			}
		}	

	}

}


        // if (condition) {
        // block of code
        // block of code
        
        // }else {
        // block of code
        // block of code
        // }





package Class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		
		boolean creditCard=true;
		int balance =1000;
		
		if (creditCard) {
			System.out.println("Let's check the balance");
			if (balance>=1000) {
				System.out.println("Pay off immediately");
			}else {
				System.out.println("you are safe");
			}	
		}else {
			System.out.println("Do you wanna a credit card");
		}

	}

}

package Class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan;
		String item;
		double price;
		double payment;
		double totalPayment = 0;
		double balance;
		double change;
		scan = new Scanner(System.in);
		System.out.println("Please enter your item");
		item = scan.nextLine();
		System.out.println("Please enter the item price");
		price = scan.nextDouble();
				do {System.out.println("Please enter your payment amount");
						payment = scan.nextDouble();
						totalPayment = totalPayment + payment;
				if (totalPayment > price) {
						change = totalPayment - price;
						System.out.println("Please take your change " + change);
						break;
				} else if (totalPayment < price) {
						balance = price - totalPayment;
						System.out.println("Please enter more $" + balance);
				}} while (totalPayment != price);
		System.out.println("Thank you for shopping!");
		
		
		
		
		

	}

}

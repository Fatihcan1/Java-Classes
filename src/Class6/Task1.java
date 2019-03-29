package Class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 * 
		 */
		
		
		
		String country;
		String language;
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
			language="English";
			break;
		case "Turkey":
			language="Turkish";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Germany":
			language="German";
			break;
		case "Egypt":
			language="Arabic";
			break;
		case "Argentina":
			language="Spanish";
			break;
        default:
        	language="Unknown";
		}
		System.out.println("Your language is "+language);
		
		

	}

}

package Class7;

import java.util.Scanner;

public class Repl7_1 {

	public static void main(String[] args) {
		String name;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter name od the instructor");
		name=scan.nextLine();
		
		switch (name) {
		
		case "Shiva":
			System.out.println("Will take care of Java assignment");
			break;
		case "Sandish":
			System.out.println("Will take care of SDLC");
			break;
		case "Weqas":
			System.out.println("Will take care of Selenium Assignment");
			break;
		case "Asel":
			System.out.println("Will take care of every assignment");
			break;
			
		    default:
		    	System.out.println("Invalid intructor selected");
		    	
		
		
		
		
		}
		
		
		
		
		
	}

}

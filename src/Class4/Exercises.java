package Class4;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner love=new Scanner(System.in);
	    
	    double bankerRate=4.5;
	    
	    System.out.println("what is userRate?");
	    double userRate=love.nextDouble();
	    
	    System.out.println("price of house");
	    double priceofhouse=love.nextDouble();
	    
	    if (userRate<bankerRate) {
	        System.out.println("I will buy house");
	        if (priceofhouse>200000) {
	            System.out.println("Take a loan");
	        }else {
	            System.out.println("pay with cash");
	        }
	    }else {
	        System.out.println("Dont buy the house");
	    }
	    
	    
	}
	    
	
	}


package com.Class11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find largest number
	
	    
	    int [] array= {200, 20, 13, 499, 65};
	    
	    int largest=array[0];
	    
	    for (int i=0; i<array.length; i++) {
	    	
	    	if (array[i]>largest) {
	    		largest=array[i];
	    	}
	    	
	    }
	    System.out.println("The largest is "+largest);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}


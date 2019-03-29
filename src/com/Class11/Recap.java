package com.Class11;

public class Recap {

	public static void main(String[] args) {
		
		String [] names=new String[7];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[5]="Shiva";
		names[6]="Sandesh";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
			
		}
		System.out.println();
		
		//  create an array using array literal
		
		
		String[] studentNames= {"Shaban", "Ali", "Bilal", "Fatih"};
		System.out.println("--------------For Loop---------");
		for (int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		
		System.out.println();
		
//		retrieve values using: advanced for loop, 
//		for each loop enhanced for loop
		
		System.out.println("----------------Advanced for Loop----------");
		for (String student:studentNames) {
			System.out.println(student);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

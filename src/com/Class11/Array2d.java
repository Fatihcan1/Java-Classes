package com.Class11;

public class Array2d {

	public static void main(String[] args) {
		

		String[][] names= {
				       
				       {"Mr", "Mrs", "Ms", "Miss"},
				       {"Smith", "Jordan", "Jackson", "Obama"},
		};
		
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][3]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		
	}

}
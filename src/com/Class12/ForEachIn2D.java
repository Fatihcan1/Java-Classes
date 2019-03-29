package com.Class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		
		
		String[][] groceryList= {
								{"banana", "orange", "apple"},
								{"onion", "potato", "cucumber"},
								{"yogurt", "cheese", "milk"}
								
		};
		
		
		for (String[] list:groceryList) {
			for (String item:list) {
				System.out.println(item);
			}
		}
	}

}

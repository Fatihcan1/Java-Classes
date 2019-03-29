package com.Class11;

public class Task2 {

	public static void main(String[] args) {

		
		
		
		
		for (String countries:country) {
			System.out.print(countries+", ");
		}
		

        String [] country= {"Turkey", "Germany", "Brasil", "Usa"};
		
		for (int i=0; i<country.length; i++) {
		  if (country[i].equals("Turkey")) {
			  
			  System.out.println("Ankara");
		  }else if (country[i].equals("Germany")) {
			  
			  System.out.println("Berlin");
		  }else if (country[i].equals("Brasil")) {
			  System.out.println("Rio");
		  }else if (country[i].equals("Usa")) {
			  System.out.println("Washington DC");
		  }
			
			
	}
		
//		String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine"};
//		
//        for (String country : contries) {
//            switch (country) {
//            case "USA":
//                System.out.println("Washington DC");
//                break;
//            case "Afghanistan":
//                System.out.println("Kabul");
//                break;
//            case "Kazakhstan":
//                System.out.println("Astana");
//                break;
//            case "Ukraine":
//                System.out.println("Kiev");
//                break;
//            }
//        }
		
	}

}

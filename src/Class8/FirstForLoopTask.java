package Class8;

public class FirstForLoopTask {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}

		for (int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
 	for (int i=1; i<=20; i+=2) {  //1.
			System.out.println(i);
	
		}
 		for(int i=20; i<=50; i+=2) { //First way
 			System.out.println(i);
 			
 		}
// 	for (int i=20; i<=50; i++) { //2.way
// 		if (i%2==0) {
// 			System.out.println(i);
// 			
// 		}
// 	}
// 		
// 		for (int i=20; i<=50; i++) {
// 			if(i%2==1) {
// 				System.out.println(i);
// 				
// 			}
// 		}
 	
 		
 		
 		for (int i=20; i<=50; i++) {
 			if (i%2==0 ) {
 				System.out.println(i);
 			}
 		}
 	   
 		for (int i=20; i<=50; i+=2) {
 			System.out.println(i);
 		}
 	
 	
 	for (int i=20; i<50; i++) {
 		if (i%2==1) {
 			System.out.println(i);
 		}
 	}
 	
 	    for (int i=20; i<=50; i+=1) {
 	    	System.out.println(i);
 	    }
 	
 	
 	    
 	    for (int i=50; i>=20; i--)	{
 	    	if (i%2==0) {
 	    		System.out.println(i);
 	    	}
 	    }
 	
 	     
 	
 	
 	
 	
 	
 	
 		
 		
 		
 		
 	
 	
		
	}

}

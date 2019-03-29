package Class6;

public class NotOperator {

	public static void main(String[] args) {
		/*
		 * not operator
		 * 
		 */
      
		boolean a=true;
		
		System.out.println("The value of boolean variable is "+a);
		
		
		boolean b=!true;
		
		System.out.println("The value of boolean variable is "+b);
		
		
		boolean snow=true;
		
		// if it i not snowing ---> I will come to the class
		// other wise I will stay at home
		
		
		if (snow) {
			System.out.println("I will stay at home ");
		}
		
		// it is not going to print!!!
		if (!snow) {
			System.out.println("I will come to the class");
		}
		
		int x=10;
		int y=20;
		
		if (!(x>y)) {
			System.out.println("Hello");
		}
		
		
	}

}

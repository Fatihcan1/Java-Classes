package Class4;

public class NestedIf {

	public static void main(String[] args) {
		double gpa=3.6;
		double expectedGpa=3.7;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately we cannot hire you");
			}
		}else {
			System.out.println("Please get your degree");
			
		}
				

	}

}

package Class5;

public class LogicalOr {

	public static void main(String[] args) {
		/*we have 7 days a week
		 * if days are from 1-5 --> weekday
		 * if days are from 6-7 --> weekend
		 * otherwise "Not a valid day"
		 * 
		 */
		
		
		int day=5;
		
		if (day==1 || day==3 || day==3 || day==4 || day==5) {
			System.out.println("it is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("it is a weekend");
		}else {
			System.out.println("Not a valid day");
		}
	}

}

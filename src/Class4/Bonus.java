package Class4;

public class Bonus {

	public static void main(String[] args) {
		int workedYears=7;
		int annual=110000;
		boolean bonus=true;
		
		if (workedYears>5) {
			System.out.println("Yayy I am eligible for the bonus");
		}else {
			System.out.println("Lol I am not eligible for the bonus");
			if (annual>50000) {
				System.out.println(" I am going to get 5000 bonus");
			}else {
				System.out.println("I am going to get 3000 bonus");
			}
		}

	}

}

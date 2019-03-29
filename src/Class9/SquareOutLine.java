package Class9;

public class SquareOutLine {

	public static void main(String[] args) {
		for (int i=1; i<=4; i++) {
			for (int y=1; y<=6; y++) {
				if (i==1 || i==4 || y==1 || y==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
				System.out.println();
		}

		
		for (int i=4; i<=19; i++) {
			for (int y=5; y<=19; y++) {
				for (int a=6; a<=9; a++) {

				    if (i==4 || i==19 || y==5 || y==19 || a==6 || a==9) {
					System.out.print("*");
				   }else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		}
		
		
	}

}

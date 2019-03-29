package Class8;

public class BerakContiniue {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		
		for (int g=0; g<=4; g++) {
			System.out.println("Hello");
			break;
		}
		
		for (int k=0; k<10; k++) {
			if  (k==2 || k==3) {
				continue;
			}
			System.out.println(k);
			System.out.println("Hi");
		}
		
		System.out.println("Hello");
		
		for (int t=1; t<=20; t++) {
			if (t%3==0) {
				continue;
			}
			System.out.println(t  );
		}
		
		
		
		
		
		
		
		
		
		
	}

}

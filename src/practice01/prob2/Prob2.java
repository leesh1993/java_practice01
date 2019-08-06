package practice01.prob2;

public class Prob2 {
	public static void main (String args[]) {
		int number = 1;
		
		for(int i = 1; i < 100; i++) {
			for(int j = 1; j < 11; j++) {
				
				System.out.print(number);
				number++;
			}
			number = i;
			System.out.printf("\n");
		}
	}
}

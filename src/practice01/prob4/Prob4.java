package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		String str = scan.nextLine();
		
		for(int i =0; i < str.length() + 1; i++) {	
			System.out.println(str.substring(0, i));
		}
	}
	
}

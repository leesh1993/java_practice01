package practice01.prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("수를 입력하시오 : ");
		int a = scan.nextInt();
		
		if(a%3 == 0) {
			System.out.printf("3의 배수 맞음");
		}else {
			System.out.printf("3의 배수 아님");
		}
	}
}

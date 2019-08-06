package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("수를 입력하시오 : ");
		int number = scan.nextInt();
		int temp = 0;
		if(number == 0) {
			System.out.printf("홀수입니다. : 0");
		}
		else if(number%2 == 0){
			System.out.printf("짝수입니다. : ");
	
			for(int i = 2; i <= number; i+=2) {
				System.out.print(i + " ");
				temp = temp + i;
			}
			
			System.out.print("답 : " + temp);
		}
		else{
			System.out.printf("홀수입니다. : ");
			
			for(int i = 1; i <= number; i+=2) {
				System.out.print(i + " ");
				temp = temp + i;
			}		
			System.out.print("답 : " + temp);
		}
	}
}

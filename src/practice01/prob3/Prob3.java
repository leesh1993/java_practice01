package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("���� �Է��Ͻÿ� : ");
		int number = scan.nextInt();
		int temp = 0;
		if(number == 0) {
			System.out.printf("Ȧ���Դϴ�. : 0");
		}
		else if(number%2 == 0){
			System.out.printf("¦���Դϴ�. : ");
	
			for(int i = 2; i <= number; i+=2) {
				System.out.print(i + " ");
				temp = temp + i;
			}
			
			System.out.print("�� : " + temp);
		}
		else{
			System.out.printf("Ȧ���Դϴ�. : ");
			
			for(int i = 1; i <= number; i+=2) {
				System.out.print(i + " ");
				temp = temp + i;
			}		
			System.out.print("�� : " + temp);
		}
	}
}

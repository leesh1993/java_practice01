package practice01.prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("���� �Է��Ͻÿ� : ");
		int a = scan.nextInt();
		
		if(a%3 == 0) {
			System.out.printf("3�� ��� ����");
		}else {
			System.out.printf("3�� ��� �ƴ�");
		}
	}
}

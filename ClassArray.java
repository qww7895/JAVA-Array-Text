package day03;

import java.util.Scanner;

public class ClassArray {
	public static void main(String []args) {
	
		ArrayTest[] studnets;
		Scanner scann = new Scanner(System.in);
		System.out.print("����� ������ Ȯ���Ͻðڽ��ϱ�? : ");
		int num=scann.nextInt();
		studnets = new ArrayTest[num];
		for(int i=0;i<studnets.length;i++) {
			studnets[i]= new ArrayTest();
		}
		for(int i=0;i<studnets.length;i++) {
			studnets[i].ShowScore();
		}
	
	}
	
}

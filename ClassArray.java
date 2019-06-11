package day03;

import java.util.Scanner;

public class ClassArray {
	public static void main(String []args) {
	
		ArrayTest[] studnets;
		Scanner scann = new Scanner(System.in);
		System.out.print("몇명의 성적을 확인하시겠습니까? : ");
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

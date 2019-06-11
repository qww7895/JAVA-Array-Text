package day03;

import java.util.Scanner;

/*
 * ����ó�� Ŭ���� ver 1
 * �ѻ�� ���� ó�� ���α׷�
 * �̸� �� �� �� : �Է�
	������ ��� ����
	�̸� �� �� �� �� �� ���
	�ʵ� String name;
		int [4]score;
		float avg;
*/
public class ArrayTest {
	private String name;
	private float avg;
	private int[] score;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setScore(int score,int index) {//(����,���� ��ȣ)�Է�
		this.score[index]=score;
	}
	public String getName() {
		return name;
	}
	public int getScore(int arr) {
		if((arr==3)&&(score[3]==0)) {//����� ���ϰų� �̹� ����� ������ �ʾ��� ���
			score[3]=getSum();
			return score[3];
		}
		return score[arr];
	}
	public int getSum() {//���� ���ϱ�
		int sum=0;
		for(int i=0;i<score.length-1;i++) {
			sum+=score[i];
		}
		return sum;
	}
	public float getAvg() {//��� ���ϱ�
			if(score[3]==0) {//������  ���������� ���� ���
				score[3]=getSum();
			}
			avg=score[3]/(score.length-1);
			return avg;
		}

	public ArrayTest(){
		Scanner scann = new Scanner(System.in);
		score = new int[4];
		System.out.print("�̸��� �Է��� �ּ��� : ");setName(scann.nextLine());
		System.out.print("���� ������ �Է��� �ּ��� : ");
		setScore(scann.nextInt(),0);
		System.out.print("���� ������ �Է��� �ּ��� : ");
		setScore(scann.nextInt(),1);
		System.out.print("���� ������ �Է��� �ּ��� : ");		
		setScore(scann.nextInt(),2);
	}
	public void ShowScore() {
		System.out.println("�̸� : "+getName());
		System.out.println("���� : "+getScore(0));
		System.out.println("���� : "+getScore(1));
		System.out.println("���� : "+getScore(2));
		System.out.println("���� : "+getScore(3));
		System.out.println("��� : "+getAvg());
	}
	public static void main(String []args) {
		ArrayTest students= new ArrayTest();
		students.ShowScore();
	}
}

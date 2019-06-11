package day03;

import java.util.Scanner;

/*
 * 성적처리 클래스 ver 1
 * 한사람 성적 처리 프로그램
 * 이름 국 영 수 : 입력
	총점과 평균 연산
	이름 국 영 수 총 평 출력
	필드 String name;
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
	public void setScore(int score,int index) {//(점수,과목 번호)입력
		this.score[index]=score;
	}
	public String getName() {
		return name;
	}
	public int getScore(int arr) {
		if((arr==3)&&(score[3]==0)) {//평균을 원하거나 이미 평균을 구하지 않았을 경우
			score[3]=getSum();
			return score[3];
		}
		return score[arr];
	}
	public int getSum() {//총점 구하기
		int sum=0;
		for(int i=0;i<score.length-1;i++) {
			sum+=score[i];
		}
		return sum;
	}
	public float getAvg() {//평균 구하기
			if(score[3]==0) {//총점이  구해져있지 않은 경우
				score[3]=getSum();
			}
			avg=score[3]/(score.length-1);
			return avg;
		}

	public ArrayTest(){
		Scanner scann = new Scanner(System.in);
		score = new int[4];
		System.out.print("이름을 입력해 주세요 : ");setName(scann.nextLine());
		System.out.print("국어 성적을 입력해 주세요 : ");
		setScore(scann.nextInt(),0);
		System.out.print("수학 성적을 입력해 주세요 : ");
		setScore(scann.nextInt(),1);
		System.out.print("영어 성적을 입력해 주세요 : ");		
		setScore(scann.nextInt(),2);
	}
	public void ShowScore() {
		System.out.println("이름 : "+getName());
		System.out.println("국어 : "+getScore(0));
		System.out.println("수학 : "+getScore(1));
		System.out.println("영어 : "+getScore(2));
		System.out.println("총점 : "+getScore(3));
		System.out.println("평균 : "+getAvg());
	}
	public static void main(String []args) {
		ArrayTest students= new ArrayTest();
		students.ShowScore();
	}
}

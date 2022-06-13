package org.java.operator;

import java.util.Scanner;

public class ScannerProject {
	public static void main(String[] args) {
		System.out.println("시험 점수를 입력하세요");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int i1 = scn.nextInt(); //국어점수
		System.out.println("입력하신 국어 점수는 " + i1 + "점 입니다.");
		
		System.out.println("영어 점수를 입력하세요.");
		int i2 = scn.nextInt(); //영어점수
		System.out.println("입력하신 영어 점수는" + i2 + "점입니다.");
		
		System.out.println("수학 점수를 입력하세요.");
		int i3 = scn.nextInt(); //수학점수
		System.out.println("입력하신 수학 점수는" + i3 + "점입니다.");
		
		
		System.out.println("국어, 영어, 수학 점수의 총점은" + (i1+i2+i3) + "입니다.");
		System.out.println("국어, 영어, 수학 점수의 평균은" + (double)(i1+i2+i3)/3 + "입니다.");
		
		
		int ko = scn.nextInt();
		int en = scn.nextInt();
		int ma = scn.nextInt();
		int sum = ko+en+ma;
		double avg = sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		scn.close();
	}
}

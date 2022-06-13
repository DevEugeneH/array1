package org.java.condition;

import java.util.Scanner;

public class IfEx6 {
	public static void main(String[] args) {
		System.out.println("If문 조건이 여러 개 일 때");

		Scanner scn = new Scanner(System.in);

		System.out.println("국어, 영어, 수학 점수를 입력, 총점, 평균, 학점(평균)");

		System.out.println("국어 점수 입력");
		int ko = scn.nextInt();
		System.out.println("영어 점수 입력");
		int en = scn.nextInt();
		System.out.println("수학 점수 입력");
		int ma = scn.nextInt();

		int sum = ko + en + ma;
		double avg = (double) (sum) / 3;

		System.out.println("총점 : " + sum + " 평균 : " + avg);
		
		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("학점 : A+");
			} else {
				System.out.println("학점 : A");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("학점 : B+");
			} else {
				System.out.println("학점 : B");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("학점 : C+");
			} else {
				System.out.println("학점 : C");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("학점 : D+");
			} else {
				System.out.println("학점 : D");
			}
		} else {
			System.out.println("학점 : F");
		}

		scn.close();
	}
}

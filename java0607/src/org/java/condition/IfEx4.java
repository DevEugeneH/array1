package org.java.condition;

import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		System.out.println("If문 조건이 여러 개 일 때");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
//		try {
		int score = scn.nextInt();
		
		
		
		if (score >= 95) {
			System.out.println("A+");
		}else if (score >= 90) {
			System.out.println("A");
		}else if (score >= 85) {
			System.out.println("B+");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 75) {
			System.out.println("C+");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 65) {
			System.out.println("D+");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
			
//		}catch (Exception e) {
//			e.printStackTrace();
//		
//		System.out.println("예외 처리");
//		}
		
		scn.close();
	}
}

package org.java.loop;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		System.out.println("for문");

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		System.out.println("=======================");
		
		for (int i = 9; i>1; i--) {
			System.out.println(i + "단");
			
			for	(int j = 1; j <10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		System.out.println("========================");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("시작단 입력");
		int startNum = scn.nextInt();
		System.out.println("끝단 입력");
		int endNum = scn.nextInt();
		
		if(startNum > endNum) {
			System.out.println("시작단이 끝단보다 작아야합니다.");
		}else {
			for (int i = startNum; i<endNum+1; i++) {
				System.out.println( i + "단");
				
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
		}
		
		scn.close();
	}
}

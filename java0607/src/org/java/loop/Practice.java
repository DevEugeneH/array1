package org.java.loop;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("시작단 입력");
		int startNum = scn.nextInt();
		
		System.out.println("끝단 입력");
		int endNum = scn.nextInt();
		
		if (startNum>endNum) {
			System.out.println("시작단보다 끝단이 작습니다");
		} else {
			for(int i = startNum; i<endNum+1; i++) {
				System.out.println( i+ "단");
				
				for(int j = 1; j <10; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
		}
		
		scn.close();
	}
}

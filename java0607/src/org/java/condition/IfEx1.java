package org.java.condition;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("If문");

		int num = 10;

		if (num >= 10) {
			System.out.println("10보다 크거나 같습니다.");
		}
		if (num >= 10) System.out.println("10보다 크거나 같습니다.");
		if (num >= 10)
			System.out.println("10보다 크거나 같습니다.");
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int key = scn.nextInt();
		if(key>100) System.out.println("100보다 크다");
		
		System.out.println("아이디를 입력하세요");
		String userId = scn.next();
		if(userId.equals("root")) System.out.println("즐거운 쇼핑 되세요!");
		
		
		scn.close();
	}
}

package org.java.condition;

import java.util.Scanner;

//import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		System.out.println("If문 조건이 두 개 일 때");

		int num1 = 10;
		int num2 = 20;

		if (num1 > 10) {
			System.out.println("10보다 큽니다.");
		} else {
			System.out.println("10보다 크지 않다");
		}

		System.out.println("================");

		if (num1 >= 10 && num2 <= 20) {
			System.out.println("조건을 만족합니다.");
		} else {
			System.out.println("조건을 충족하지 못하였습니다.");
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("아이디 입력");
		String userId = scn.nextLine();
		System.out.println("비밀번호 입력");
		String userPw = scn.nextLine();

		if (userId.equals("root") && userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑되세요!");
		} else {
			System.out.println("회원이 아니시군요");
		}

		System.out.println("========================");

		if (!userId.equals("root") || !userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑 되세요!");
		} else {
			System.out.println("회원이 아니시군요");
		}

		
		scn.close();
	}
}

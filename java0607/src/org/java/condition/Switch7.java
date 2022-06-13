package org.java.condition;

import java.util.Scanner;

public class Switch7 {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("쿼리문을 입력하세요(insert,select,update,delete)");
		
		String input = scn.next();
		
		switch(input) {
		case "insert":
			System.out.println("회원가입 페이지로 이동합니다.");
			break;
		case "select":
			System.out.println("회원정보 수정 페이지로 이동합니다.");
			break;
		case "update":
			System.out.println("회원정보 조회 페이지로 이동합니다.");
			break;
		case "delete":
			System.out.println("회원 정보 삭제 페이지로 이동합니다.");
			break;
		default:
			System.out.println("저런 쿼리문을 입력하셔야지요");
		}
		
		System.out.println("java2022".charAt(0)); //문자열 0
		System.out.println("java2022".charAt(1)); //문자열 1
		System.out.println("java2022".charAt(2)); //문자열 2
		System.out.println("java2022".charAt(3)); //문자열 3
		System.out.println("java2022".charAt(4)); //문자열 4
	
		
		scn.close();
	}
}

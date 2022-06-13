package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("쿼리문을 입력하세요(insert, update, select, delete");

		String query = scn.nextLine();

		if (query.equals("insert")) {
			System.out.println("회원 가입 페이지로 이동합니다.");
		} else if (query.equals("update")) {
			System.out.println("회원 수정 페이지로 이동합니다.");
		} else if (query.equals("select")) {
			System.out.println("회원 조회 페이지로 이동합니다.");
		} else if (query.equals("delete")) {
			System.out.println("회원 탈퇴 페이지로 이동합니다.");
		} else {
			System.out.println("저런 쿼리문을 입력하셔야지요");
		}

//		CRUD (Create, Read, Update, Delete)
		
		scn.close();
	}
}

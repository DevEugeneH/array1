package org.java.condition;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("영문 한 자 입력");
		
		char ch = scn.next().charAt(0);
		
		switch(ch) {
		case 'A':
		case 'a':
			System.out.println("A입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("B입니다.");
			break;
		case 'C':
		case 'c':
			System.out.println("C입니다.");
			break;
		default:
			System.out.println("A, B, C 중에서만 입력해주세요");
		}
		scn.close();
	}
}

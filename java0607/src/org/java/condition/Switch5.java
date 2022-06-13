package org.java.condition;

import java.util.Scanner;

public class Switch5 {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100)");
		
		int num = scn.nextInt();
		
		char grade = ' ';
		
		switch (num/10){
			case 10:
			case  9:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 60:
				grade='D';
				break;
				
			default: 
				grade='F';
		}
		
		System.out.println("학점 = " + grade);
		
		scn.close();
	}
}

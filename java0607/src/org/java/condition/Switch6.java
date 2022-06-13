package org.java.condition;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력");
		int num1 = scn.nextInt();
		
		System.out.println("두번째 정수 입력");
		int num2 = scn.nextInt();
		
		System.out.println("연산자를 입력하세요(+-*/%)");
		char op = scn.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}
		System.out.println("연산의 결과는 " + num1 + " " + op + " " + num2 + " = " + result);
		scn.close();
	}
}

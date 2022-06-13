package org.java.loop;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		System.out.println("while");

		int i = 2;

		while (i < 10) {

			System.out.println(i + " 단");

			int j = 1;

			while (j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}

			i++;

		}
		
		System.out.println("====================");

	
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num1 = scn.nextInt();
		
		while (num1<10) {
			System.out.println(num1 + "단");
		
			int j = 1;
			while (j<10) {
				System.out.println(num1 + " * " + j + " = " + (num1*j));
				j++;
			}
		num1++;
		}
		
		
		scn.close();
		
	}
}

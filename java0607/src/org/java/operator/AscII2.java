package org.java.operator;

import java.util.Scanner;

public class AscII2 {
	public static void main(String[] args) {
		System.out.println("대문자 혹은 소문자를 입력해주세요(65~90 && 95~122)");

		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();

		if (alpa > 64 && alpa < 91) {
			System.out.println("입력값 : " + alpa);
			System.out.println("대문자 : " + (char) alpa);

			int upAlpa = alpa + 32;
			System.out.println(upAlpa);
			System.out.println("소문자 :" + (char) upAlpa);

		} else if (alpa > 96 && alpa < 123) {
			System.out.println("입력값 : " + alpa);
			System.out.println("소문자 : " + (char) alpa);

			int downAlpa = alpa - 32;
			System.out.println(downAlpa);
			System.out.println("대문자 : " + (char) downAlpa);

		} else {
			System.out.println("다시 65~90 && 97~122 정수를 입력해주세요");
		}

		scn.close();
	}
}

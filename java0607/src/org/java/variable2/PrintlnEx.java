package org.java.variable2;

public class PrintlnEx {
	public static void main(String[] args) {

		// 자동으로 줄바꿈
		System.out.println(10 + 10); // 20
		System.out.println(10 + "10"); // 1010
		System.out.println(10 + 10 + "10"); // 2010
		System.out.println(10 + "10" + 10); // 101010
		System.out.println(10 + 10 + ""); // "20"

		// 줄바꿈 없음
		System.out.print("자동 줄바꿈이 없다");
		System.out.printf("%d", 1000); // 포맷 c언어에서 많이 사용

		int num1 = 10;
		int num2 = 10;

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
}

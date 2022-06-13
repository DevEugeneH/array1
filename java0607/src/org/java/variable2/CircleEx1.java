package org.java.variable2;

import java.util.Scanner;

public class CircleEx1 {
	public static void main(String[] args) {
		System.out.println("원의 넓이를 구하시오");

		Scanner scn = new Scanner(System.in);

		System.out.println("반지름을 입력(정수형)");
		int radius = scn.nextInt();
		final double PI = 3.14;

//		double CircleNum = radius * radius * PI;
		int CircleNum = (int) (radius * radius * PI);

		System.out.println(radius + " * " + radius + " * " + PI + " = " + (radius * radius * PI));
		System.out.println("입력한 반지름 값을 가진 원의 넓이는 " + (CircleNum) + " 입니다.");
		scn.close();
	}
}

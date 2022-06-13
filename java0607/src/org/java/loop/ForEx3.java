package org.java.loop;

public class ForEx3 {
	public static void main(String[] args) {
		System.out.println("for문을 이용하여 1부터 100까지의 숫자 중 짝수를 출력");

		for (int i = 2; i <= 100; i = i + 2) {
			System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}

		System.out.println("=============");

		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}

		System.out.println("============");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("============");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 1) {
				System.out.print(i + " ");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("============");

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print((sum += i) + " ");
			}
			if (sum % 100 == 0) {
				System.out.println();
			}
		}
	}
}

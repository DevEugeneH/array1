package org.java.operator;

public class AscII1 {
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println((int) 'A');

		char ch = 'A';
		System.out.println(ch); // A
		System.out.println((int) ch); // 65

		System.out.println('B' - 'A'); // 1
		System.out.println('a' - 'b'); // -1
		System.out.println('b' - 32); // 66
		System.out.println('b'); // b
		System.out.println((char) ('b' - 32)); // B

		System.out.println('A'); // A
		System.out.println('A' + 32); // 97
		System.out.println((char) 'A' + 32); // 97

	}
}

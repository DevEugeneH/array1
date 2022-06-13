package org.java.variable;

public class VarEx2 {
	public static void main(String[] args) {
		System.out.println("변수, 데이터 타입");
		System.out.println("primitive type");
				
		// 정수형 데이터
		byte b = 10; // 정수형 데이터 1byte를 저장할 수 있는 변수 b를 선언하고, 10으로 초기화 했다.
		short s = 10; // 정수형 데이터 2byte를 저장할 수 있는 변수 s를 선언하고, 10으로 초기화 했다.
		int i = 10; // 정수형 데이터 4byte를 저장할 수 있는 변수 i를 선언하고, 10으로 초기화 했다.
		long l = 10l; // 정수형 데이터 8byte를 저장할 수 있는 변수 l을 선언하고, 10l로 초기화 했다.

		// 실수형 데이터
		float f = 1.1f; // 실수형 데이터 4byte를 저장할 수 있는 f를 선언하고, 1.1f로 초기화했다.
		double d = 1.1; // 실수형 데이터 8byte를 저장할 수 있는 d를 선언하고, 1.1로 초기화했다.

		// 문자형 데이터
		char ch = 'a'; // 문자형 데이터 2byte를 저장할 수 있는 변수 ch를 선언하고, 'a'로 초기화했다.

		// 논리형 데이터
		boolean bool = false; // boolean형 1byte를 저장할 수 있는 변수 bool를 선언하고, false로 초기화했다.
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}
}

package org.java.operator;

public class Operator10 {
	public static void main(String[] args) {
		System.out.println("단항 연산자");
		
		int i = 10;
		
		//선 처리 후 증가		
		System.out.println(i++); //i:10
		System.out.println(i); //i:11
		
		//선 증가 후 처리		
		System.out.println(++i); //i:12
		System.out.println(i); //i:12
		
		System.out.println(i--); //i :12
		System.out.println(i); //i:11
		
		System.out.println(--i); // i:10
		System.out.println(i); // i:10
	}
}

package org.java.operator;

public class Operator10 {
	public static void main(String[] args) {
		System.out.println("���� ������");
		
		int i = 10;
		
		//�� ó�� �� ����		
		System.out.println(i++); //i:10
		System.out.println(i); //i:11
		
		//�� ���� �� ó��		
		System.out.println(++i); //i:12
		System.out.println(i); //i:12
		
		System.out.println(i--); //i :12
		System.out.println(i); //i:11
		
		System.out.println(--i); // i:10
		System.out.println(i); // i:10
	}
}
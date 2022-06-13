package org.java.condition;

//import java.util.Scanner;

//import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		System.out.println("If문 조건이 여러 개 일 때");
		
		int grade = 61;
		
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80) {
			System.out.println("B");
		}else if (grade>=70) {
			System.out.println("C");
		}else if (grade>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
}

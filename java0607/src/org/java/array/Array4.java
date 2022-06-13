package org.java.array;

public class Array4 {
	public static void main(String[] args) {
		System.out.println("배열");

		int[][] arr1 = new int[4][3];

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);

		System.out.println(arr1.length); // 행의 개수
		System.out.println(arr1[0].length); // 번지수
		System.out.println(arr1[1].length); // 번지수
		System.out.println(arr1[2].length); // 번지수
		System.out.println(arr1[3].length); // 번지수

		int a = 1;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println((i+1) + "행");
			for (int j = 0; j < arr1[j].length; j++) {
				//1~12까지 초기화
				
				arr1[i][j] = a++;
				
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}

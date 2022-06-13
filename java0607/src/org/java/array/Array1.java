package org.java.array;

public class Array1 {
	public static void main(String[] args) {
		System.out.println("배열");

//		int arr2[] = new int[5];
		// int 형 데이터를 저장할 수 있는 배열 arr1를 선언했다.
		int[] arr1 = new int[5];

		// int형 데이터를 저장할 수 있는 배열 arr3를 선언하고 int 형 1,2,3,4,5를 초기화했다.
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		// int형 데이터를 저장할 수 있는 배열 arr4를 선언하고 int 형 1,2,3,4,5를 초기화했다.
		int[] arr4 = { 1, 2, 3, 4, 5 };

//		초기화
//		arr1[0] = 1;
//		arr1[1] = 2;
//		arr1[2] = 3;
//		arr1[3] = 4;
//		arr1[4] = 5;
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);

		// for문을 이용하여 arr1를 01234로 초기화 하고 콘솔에 각 번지의 값을 출력해보세요.

		System.out.println("배열의 총개수 : " + arr1.length);
		System.out.println("배열의 마지막 인덱스 : " + (arr1.length - 1));

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

		char[] chArr1 = new char[5];
		for (int i = 0; i < chArr1.length; i++) {
			System.out.println("chArr1[" + i + "] = " + chArr1[i]);
		}
		char[] chArr2 = new char[] { 'a', 'b', 'c', 'd', 'e' };
		for (int i = 0; i < chArr2.length; i++) {
			System.out.println("chArr2[" + i + "] = " + chArr2[i]);
		}

		String[] strArr = new String[] { "j", "a", "v", "a", "22" };
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr[" + i + "] = " + strArr[i]);
		}

		int[] lotto = new int[45];
		int lottoSize = lotto.length;
		for (int i = 0; i < lottoSize; i++) {
			lotto[i] = i + 1;
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}

	}
}

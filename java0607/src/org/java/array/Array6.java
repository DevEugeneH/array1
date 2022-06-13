package org.java.array;

public class Array6 {
	public static void main(String[] args) {
		System.out.println("배열");

		int[][] score = { { 100, 66, 77 }, { 88, 66, 88 }, { 80, 46, 97 }, { 70, 88, 80 }, { 100, 90, 88 } };

		int kor = 0;
		int math = 0;
		int eng = 0;
		double avg = 0.0;
		int scoreLength = score.length; // 배열의 길이
		int allScore = 0;
		double allAvg = 0.0;
		double avgAvg = 0.0;
		System.out.println("중간고사 성적표");
		System.out.println("번호 \t국어 \t수학 \t영어 \t총점 \t평균");
		System.out.println("=============================================");

		for (int i = 0; i < scoreLength; i++) {
			System.out.print((i + 1) + "번\t");
			int sum = 0;

			kor += score[i][0]; // score 배열의 0번지 합계(국어)
			math += score[i][1]; // score 배열의 1번지 합계(수학)
			eng += score[i][2]; // score 배열의 2번지 합계(영어)

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "점\t");
				sum += score[i][j]; // 총점
				allScore +=score[i][j];
				allAvg = allScore / scoreLength;
				avgAvg = Math.round((double) allAvg / score[i].length);
			}
			avg = Math.round((double) sum / score[i].length);
			System.out.println(sum + "점\t" + avg + "점");
		}

		System.out.println("=============================================");
		System.out.println("총점:\t" + kor + "점\t" + math + "점\t" + eng + "점\t" + allScore + "점\t" + allAvg + "점");
		System.out.println(
				"평균:\t" + (kor / scoreLength) + "점\t " + (math / scoreLength) + "점\t " + (eng / scoreLength) + "점\t" + "\t" + avgAvg + "점");
	}
}

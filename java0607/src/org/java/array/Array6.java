package org.java.array;

public class Array6 {
	public static void main(String[] args) {
		System.out.println("�迭");

		int[][] score = { { 100, 66, 77 }, { 88, 66, 88 }, { 80, 46, 97 }, { 70, 88, 80 }, { 100, 90, 88 } };

		int kor = 0;
		int math = 0;
		int eng = 0;
		double avg = 0.0;
		int scoreLength = score.length; // �迭�� ����
		int allScore = 0;
		double allAvg = 0.0;
		double avgAvg = 0.0;
		System.out.println("�߰���� ����ǥ");
		System.out.println("��ȣ \t���� \t���� \t���� \t���� \t���");
		System.out.println("=============================================");

		for (int i = 0; i < scoreLength; i++) {
			System.out.print((i + 1) + "��\t");
			int sum = 0;

			kor += score[i][0]; // score �迭�� 0���� �հ�(����)
			math += score[i][1]; // score �迭�� 1���� �հ�(����)
			eng += score[i][2]; // score �迭�� 2���� �հ�(����)

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "��\t");
				sum += score[i][j]; // ����
				allScore +=score[i][j];
				allAvg = allScore / scoreLength;
				avgAvg = Math.round((double) allAvg / score[i].length);
			}
			avg = Math.round((double) sum / score[i].length);
			System.out.println(sum + "��\t" + avg + "��");
		}

		System.out.println("=============================================");
		System.out.println("����:\t" + kor + "��\t" + math + "��\t" + eng + "��\t" + allScore + "��\t" + allAvg + "��");
		System.out.println(
				"���:\t" + (kor / scoreLength) + "��\t " + (math / scoreLength) + "��\t " + (eng / scoreLength) + "��\t" + "\t" + avgAvg + "��");
	}
}

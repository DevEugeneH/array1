package org.java.loop;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���۴� �Է�");
		int startNum = scn.nextInt();
		
		System.out.println("���� �Է�");
		int endNum = scn.nextInt();
		
		if (startNum>endNum) {
			System.out.println("���۴ܺ��� ������ �۽��ϴ�");
		} else {
			for(int i = startNum; i<endNum+1; i++) {
				System.out.println( i+ "��");
				
				for(int j = 1; j <10; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
		}
		
		scn.close();
	}
}

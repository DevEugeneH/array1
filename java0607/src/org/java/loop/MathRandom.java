package org.java.loop;

public class MathRandom {
	public static void main(String[] args) {
		System.out.println("Math.Random(����) 0<= Math.random() < 1");
		
		System.out.println(Math.random()); //double
		
		//0<= Math.random() >1
		
		//0+10 <= Math.random() *10 <1*10 (0<= <10)
		
		double rad = Math.random()*10;
//		System.out.println("����(0�̻� 10�̸�");/n"+
//		Math.random() * 10 +"/nint�� :" + (int)(Math.random()*10));
		
		System.out.println("���� (0�̻� 10�̸�)\n" + rad + "\nint�� : " + (int)rad);
		
		for (int i=0; i<10; i++) {
			double rad2 = Math.random()*10;
			System.out.println((int) rad2 + " ");
		}
 	}
}

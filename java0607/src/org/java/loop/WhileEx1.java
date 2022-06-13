package org.java.loop;

public class WhileEx1 {
	public static void main(String[] args) {
		System.out.println("while");

		int i = 0;

		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("=================");

		int i2 = 0;
		while (true) {
			System.out.print(i2);
			
			if(i2>=9) break;
			
			i2++;
		}
		
		System.out.println("================");
			
	}
}

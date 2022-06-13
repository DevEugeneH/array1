package org.java.loop;

public class ForEx1 {
	public static void main(String[] args) {
		System.out.println("for문");
		
		for(int i = 0; i < 10 ; i++) {
//			System.out.println(i);
//			System.out.print(i + " ");
			
//			int i2 = i+1;
//			System.out.println(i2 + " ");
			
//			System.out.print((i+1) + ", ");
			
//			if (i+1<=9) {
//				System.out.print(i+1 + ", ");
//			} else if(i+1 == 10) {
//				System.out.print(i+1);
//			}
			
//			if (i==9) {
//				System.out.print((i+1));
//			} else {
//				System.out.print((i+1) + ", ");
//			}
			
			if(i==9) {
				System.out.println((i+1));
				break; //하위 명령문을 실행하지 않고 종료한다.
			}
			System.out.print((i+1) + ", ");
			
		}
		
		System.out.println("====================");
		
		for(int i =0; i<10; i++) {
//			String url = "";
			
			System.out.println(("url(img/bg"+i+".jpg) no-repeat 50%.cover"));
			
		}
	}
}

package org.java.array;

public class Array3 {
	public static void main(String[] args) {
		System.out.println("¹è¿­");
		
//		int i;
		char[] ch = {'C', 'A', 'F', 'E'};
		
		String s1 = new String(ch);
		System.out.println(s1);
		System.out.println(s1.equals("CAFE"));
		
		String[] binary = { 
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1100",
				"1100", "1101", "1110", "1111"
		};
		
		String result = "";
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='0') {
				result+=binary[ch[i]-'0'];
			}else {
				result+=binary[ch[i]-'A'+10];
			}
		}
		
		System.out.println("ch=" + new String(ch));
		System.out.println("ch=" + String.copyValueOf(ch));
		System.out.println(result);
		
		//
	}
}

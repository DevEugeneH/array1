package org.java.variable2;

public class VarEx1 {
	public static void main(String[] args) {
		System.out.println("����, �ڷ���, ����ȭ");

		int i = 10;
		char ch = 'a';

		ClassBasic c1 = new ClassBasic();

		// ����� ���� Ÿ��(Ŭ����)
		// �ν��Ͻ�ȭ(��üȭ)
		VarSub v1 = new VarSub();
		v1.num1 = 100;
		v1.num2 = 200;
		v1.sum();
		v1.method(200, 500);

		String str1 = new String();
		str1 = "���ڿ�, ��ü��, �ڷ���";
		System.out.println(str1);
	}
}
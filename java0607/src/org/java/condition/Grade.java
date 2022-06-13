package org.java.condition;
public class Grade {
	//(필드, 프로퍼티)
	private int kor; // 인스턴스멤버(필드, 프로퍼티)
	private int eng; // 인스턴스멤버
	private int math;

//Construct(생성자)
	public Grade(int kor, int eng, int math) {
			this.kor=kor;
			this.eng=eng;
			this.math=math;
	}
	//메서드(method)
	public void sumGrade() {
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		int sum=kor+eng+math;
		System.out.println("총점: "+sum);
	}
	//메서드(method)
	public void avgGrade() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("평균: "+avg);
	}
	//메서드(method)
	public double avgGet() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		return avg;
	}
}
package org.kh.oop;
 // ĸ��ȭ (�ʵ� - �޼ҵ�)
public class Student {
	private String name; // ������ �� �ϰ� �ؾ� data ��Ŵ
	private int kor;
	private int eng;
	private int math;
	
	// �⺻ ������ 
	public Student() {} // �Ű����� �ִ� �����ڸ� ���� �� ������ �⺻ �����ڸ� ��������.
	
	// �Ű����� �ִ� ������
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// *** getter �� setter �޼ҵ� ***
	
	// setter �޼ҵ� - �ʵ忡 �� ����
	// getter �޼ҵ� - �ʵ忡 ����� �� �ε�
	public String getName() {
		return name; // 
	}
	public void setName(String name) {
		this.name=name; // 4���� �ʵ忡 ����, this �ǹ̴� field�� ����� �Ű������� ����+�ǹ�
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public double avg() {
		return (double)this.total()/3 ;
	}
	public int total () { // �հ�
		return kor+eng+math;
	}
}

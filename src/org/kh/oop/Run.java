package org.kh.oop;

import java.util.Scanner;

public class Run {
	public static void main(String[]args) {
		// new Person().introduce();
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		p.age=sc.nextInt();
		System.out.println("�̸� �Է� : ");
		p.name=sc.next();
		p.introduce();
	}
}

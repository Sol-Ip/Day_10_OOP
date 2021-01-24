package org.kh.oop;

import java.util.Scanner;

public class StudentList {
	// int [] scores;
	Student[] scores;

	public StudentList() {
		// scores = new int[3]; // 0 0 0
		scores = new Student[3];
	}

	int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	void insertScore() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Student(); //  중요 !! 3개의 공간 중 1개씩 공간에 입력을 한다
			System.out.println((i + 1) + "번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String studentName = sc.next();
			scores[i].setName(studentName);
			System.out.print("국어 점수 입력 : ");
			int kor = sc.nextInt();
			scores[i].setKor(kor);
			System.out.print("영어 점수 입력 : ");
			int eng = sc.nextInt();
			scores[i].setEng(eng);
			System.out.print("수학 점수 입력 : ");
			int math = sc.nextInt();
			scores[i].setMath(math);

			// scores[i].name=sc.next();
			// scores[i].kor=sc.nextInt();
			// scores[i].eng=sc.nextInt();
			// scores[i].math=sc.nextInt();

			/*
			 * do { // while(scores[i] < 0 || scores[i]>100) 으로 작성할 경우 () 의 값이 false가 됨
			 * System.out.print((i + 1) + "번째 학생의 성적 : "); scores[i] = sc.nextInt(); if
			 * (scores[i] < 0 || scores[i] > 100) { System.out.println("입력 범위를 벗어났습니다."); }
			 * } while (scores[i] < 0 || scores[i] > 100); }
			 */

		}

	}

	void printScore() {

		// int[] scores = new int[3]; === 지역 변수
		System.out.println("<<입력한 학생들의 성적>>");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i].getName() + "학생의 성적");
			System.out.println(" 학생의 국어 성적 : " + scores[i].getKor());
			System.out.println(" 학생의 영어 성적 : " + scores[i].getEng());
			System.out.println(" 학생의 수학 성적 : " + scores[i].getMath());
			System.out.println(" 학생의 점수 총합 : " + scores[i].total());
			System.out.printf(" 학생의 평균 : %.2f \n" , scores[i].avg());
			System.out.println("=========================");

		}
		/*
		 * System.out.println("학생들의 성적 총 합계 : " + sum);
		 * System.out.printf("학생들의 평균 점수 : %.2f\n", (double) sum / scores.length);
		 */
		// sum = 0; // 다시 입력했을 때 성적이 누적되지 않도록 함

	}
}

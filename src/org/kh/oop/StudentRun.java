package org.kh.oop;

public class StudentRun {
	public static void main(String[]args) {
		StudentList sList = new StudentList();
		
		���� : 
			while (true) {
			// F3 or ctrl + click
			// atl + ��
			int choice = sList.showMenu();

			switch (choice) {
			
			case 1:
				sList.insertScore(); 
				break;

			case 2:
				sList.printScore();
				break;
				
			case 3:
				break ����;

			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}

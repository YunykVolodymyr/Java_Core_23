package ua.yunyk;

import java.util.Scanner;

public interface AddDeputy {
	
	Scanner s = new Scanner(System.in);
	
	public static Deputy addDeputy() throws Exception {
		System.out.print("������ ��'� ");
		String firstName = s.next();
		System.out.print("������ ������� ");
		String lastName = s.next();
		System.out.print("������ �� ");
		int age = s.nextInt();
		System.out.print("������ ���� ");
		float weight = s.nextFloat();
		System.out.print("������ ��� ");
		float height = s.nextFloat();
		System.out.print("�� � ����������? (\"���\" ��� \"ͳ\")");
		boolean bribeTaker = bool(s.next());
		
		return new Deputy(height, weight, lastName, firstName, age, bribeTaker);
	}
	
	public static boolean bool(String str) throws Exception {
		
		if(str.equalsIgnoreCase("���")) {
			return true;
		} else if(str.equalsIgnoreCase("ͳ")) {
			return false;
		} else {
			throw new Exception();
		}
	}
	
}
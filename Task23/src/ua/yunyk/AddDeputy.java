package ua.yunyk;

import java.util.Scanner;

public interface AddDeputy {
	
	Scanner s = new Scanner(System.in);
	
	public static Deputy addDeputy() throws Exception {
		System.out.print("Введіть ім'я ");
		String firstName = s.next();
		System.out.print("Введіть прізвище ");
		String lastName = s.next();
		System.out.print("Введіть вік ");
		int age = s.nextInt();
		System.out.print("Введіть вагу ");
		float weight = s.nextFloat();
		System.out.print("Введіть ріст ");
		float height = s.nextFloat();
		System.out.print("Чи є хабарником? (\"Так\" або \"Ні\")");
		boolean bribeTaker = bool(s.next());
		
		return new Deputy(height, weight, lastName, firstName, age, bribeTaker);
	}
	
	public static boolean bool(String str) throws Exception {
		
		if(str.equalsIgnoreCase("Так")) {
			return true;
		} else if(str.equalsIgnoreCase("Ні")) {
			return false;
		} else {
			throw new Exception();
		}
	}
	
}
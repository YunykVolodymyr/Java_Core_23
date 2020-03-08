package ua.yunyk;

import java.util.Scanner;

public class Application3 {
	
	public static void main(String[] args) {
		Manage manage = new Manage();
		Scanner s = new Scanner(System.in);
		while(true) {
			menu();
			String key = s.next();
		switch (key) {
			case "1":
				manage.add();
				break;
			case "2":
				manage.remove();
				break;
			case "3":
				manage.replace();
				break;
			case "4":
				manage.sortByName();
				break;
			case "5":
				manage.sortByLength();
				break;
			case "6":
				manage.sortByWidth();
				break;
			case "7":
				manage.sortByWeight();
				break;
			case "8":
				manage.printElement();
				break;
			case "9":
				manage.printAll();
				break;
			case "10":
				System.exit(0);
				break;
			default:
				System.out.println("Write number 1..10");
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("Write 1 to add commodity");
		System.out.println("Write 2 to remove commodity");
		System.out.println("Write 3 to replace commodity");
		System.out.println("Write 4 to order by name");
		System.out.println("Write 5 to order by length");
		System.out.println("Write 6 to order by width");
		System.out.println("Write 7 to order by weight");
		System.out.println("Write 8 to print element by id");
		System.out.println("Write 9 to print all elements ");
		System.out.println("Write 10 to exite");
	}
	
}
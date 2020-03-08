
package ua.yunyk;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			menu();
			VerhovnaRada vr = VerhovnaRada.VerhovnaRada();
			String key = s.next();

			switch (key) {
			case "1":
				vr.addFraction();
				break;
			case "2":
				vr.removeFraction();
				break;
			case "3":
				vr.printAllFractions();
				break;
			case "4":
				System.out.println("Введіть назву фракції");
				String name = s.next();
				if (vr.fractions.stream().anyMatch(f -> f.getName().equalsIgnoreCase(name)))
					vr.fractions.stream().filter(t -> t.getName().equalsIgnoreCase(name)).distinct().findAny().get()
							.removeAllDeputies();
				else
					System.out.println("Фракції з такою назвою немає");
				break;
			case "5":
				vr.printAllDeputies();
				break;
			case "6":
				vr.addDeputyToFraction();
				break;
			case "7":
				vr.removeDeputyFromFraction();
				break;
			case "8":
				vr.printAllBribeTakers();
				break;
			case "9":
				vr.printTheLargestBribeTaker();
				break;
			case "10":
				flag = false;
				break;
			default:
				System.out.println("Write the number 1..10");
				break;
			}
		}

	}

	public static void menu() {
		System.out.println("\n--------------------*------------------");
		System.out.println("Write 1 to add fraction");
		System.out.println("Write 2 to remove fraction");
		System.out.println("Write 3 to print all fractions");
		System.out.println("Write 4 to clean up fraction");
		System.out.println("Write 5 to print fraction");
		System.out.println("Write 6 to add the deputy to fraction");
		System.out.println("Write 7 to remove the deputy from fraction");
		System.out.println("Write 8 to print all bribe takers");
		System.out.println("Write 9 to pring the largest bribe taker");
		System.out.println("Write 10 to exite");
		System.out.println("--------------------*------------------\n");

	}

}
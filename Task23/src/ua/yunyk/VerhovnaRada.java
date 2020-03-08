package ua.yunyk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerhovnaRada {

	private static VerhovnaRada verhovnaRada = null;
	List<Fraction> fractions = new ArrayList<>();
	Scanner s = new Scanner(System.in);

	private VerhovnaRada() {
	}

	public static VerhovnaRada VerhovnaRada() {
		if (verhovnaRada == null)
			verhovnaRada = new VerhovnaRada();
		return verhovnaRada;
	}

	public void addFraction() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		fractions.add(new Fraction(name));
	}

	public void removeFraction() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		fractions.removeIf(t -> t.getName().equalsIgnoreCase(name));
	}

	public void printAllFractions() {
		fractions.stream().map(Fraction::getName).distinct().forEach(f -> System.out.println(f));
	}

	public void printFraction() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		if (fractions.stream().anyMatch(f -> f.getName().equalsIgnoreCase(name)))
			fractions.stream().filter(f -> f.getName().equalsIgnoreCase(name)).distinct().findAny()
					.ifPresent(t -> t.printAllDeputies());
		else
			System.out.println("Фракції з такою назвою немає");
	}

	public void addDeputyToFraction() throws Exception {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		if (fractions.stream().anyMatch(f -> f.getName().equalsIgnoreCase(name)))
			fractions.stream().filter(t -> t.getName().equalsIgnoreCase(name)).distinct().findAny().get().addDeputy();
		else
			System.out.println("Фракції з такою назвою немає");
	}

	public void removeDeputyFromFraction() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		if (fractions.stream().anyMatch(f -> f.getName().equalsIgnoreCase(name)))
			fractions.stream().filter(f -> f.getName().equalsIgnoreCase(name)).findAny().get().removeDeputy();
		else
			System.out.println("Фракції з такою назвою немає");
	}

	public void printAllBribeTakers() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		if (fractions.stream().anyMatch(f -> f.getName().equalsIgnoreCase(name)))
			fractions.stream().filter(f -> f.getName().equalsIgnoreCase(name)).findAny().get().printAllBribeTakers();
		else
			System.out.println("Фракції з такою назвою немає");
	}

	public void printTheLargestBribeTaker() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		if (fractions.stream().anyMatch(f -> f.getName().equalsIgnoreCase(name)))
			fractions.stream().filter(f -> f.getName().equalsIgnoreCase(name)).findAny().get()
					.printTheLargestBribeTaker();
		else
			System.out.println("Фракції з такою назвою немає");
	}

	public void printAllDeputies() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		if (fractions.stream().anyMatch(f -> f.getName().equalsIgnoreCase(name)))
			fractions.stream().filter(f -> f.getName().equalsIgnoreCase(name)).findAny().get().printAllDeputies();
		else
			System.out.println("Фракції з такою назвою немає");
	}


}
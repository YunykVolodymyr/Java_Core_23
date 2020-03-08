package ua.yunyk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fraction implements AddDeputy {

	private String name;

	public Fraction(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fraction [name=" + name + "]";
	}

	List<Deputy> deputies = new ArrayList<>();

	public void addDeputy() throws Exception {
		deputies.add(AddDeputy.addDeputy());
	}

	public void removeDeputy() {
		System.out.print("Введіть ім'я ");
		String firstName = s.next();
		System.out.print("Введіть прізвище ");
		String lastName = s.next();
		deputies.removeIf(t -> t.getFirsName().equals(firstName) && t.getLastName().equalsIgnoreCase(lastName));
	}

	public void printAllBribeTakers() {
		if (deputies.stream().anyMatch(t -> t.isBribeTaker()))
			deputies.stream().filter(Deputy::isBribeTaker).distinct().collect(Collectors.toList())
					.forEach(t -> System.out.println(t));
		else
			System.out.println("В фракції немає хабарників");
	}

	public void printTheLargestBribeTaker() {

		Optional<Deputy> d = deputies.stream().max(Comparator.comparing(Deputy::getBribeSize));
		if (d.isPresent())
			System.out.println(d.get());
		else
			System.out.println("В фракції немає хабарників");

	}

	public void printAllDeputies() {
		if (deputies.stream().anyMatch(t -> t.getFirsName().length() > 0))
			deputies.stream().distinct().forEach(d -> System.out.println(d));
		else
			System.out.println("В фракції немає депутатів");
	}

	public void removeAllDeputies() {
		if (deputies.isEmpty())
			System.out.println("В фракції немає депутатів");
		else
			deputies.removeAll(deputies);
		System.out.println("Фракцію очищено");
	}

}
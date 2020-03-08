package ua.yunyk;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Manage {

	private Set<Commodity> commodities = new LinkedHashSet<Commodity>();
	
	public void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("Write name");
		String name = s.next();
		System.out.println("Write length");
		double length = s.nextDouble();
		System.out.println("Write width");
		double width = s.nextDouble();
		System.out.println("Write weight");
		double weight = s.nextDouble();
		commodities.add(new Commodity(name, length, width, weight));
	}
	
	public void remove() {
		Scanner s = new Scanner(System.in);
		System.out.println("Write name");
		String name = s.next();
		System.out.println("Write length");
		double length = s.nextDouble();
		System.out.println("Write width");
		double width = s.nextDouble();
		System.out.println("Write weight");
		double weight = s.nextDouble();
		
		commodities.removeIf(t -> t.getLength() == length && t.getName().equalsIgnoreCase(name) && 
				t.getWeight() == weight && t.getWidth() == width);
	}
	
	public void replace() {
		Scanner s = new Scanner(System.in);
		System.out.println("Write name for old commodity");
		String name = s.next();
		System.out.println("Write length for old commodity");
		double length = s.nextDouble();
		System.out.println("Write width for old commodity");
		double width = s.nextDouble();
		System.out.println("Write weight for old commodity");
		double weight = s.nextDouble();
		commodities.removeIf(t -> t.getLength() == length && t.getName().equalsIgnoreCase(name) && 
				t.getWeight() == weight && t.getWidth() == width);
		add();
	}
	
	public void sortByName() {
		List<Commodity> h = commodities.stream().distinct().sorted(Comparator.comparing(Commodity::getName)).collect(Collectors.toList());
		commodities.removeAll(commodities);
		commodities.addAll(h);}
	
	public void sortByLength() {
		List<Commodity> h = commodities.stream().distinct().sorted(Comparator.comparing(Commodity::getLength)).collect(Collectors.toList());
		commodities.removeAll(commodities);
		commodities.addAll(h);
	}
	
	public void sortByWidth() {
		List<Commodity> h = commodities.stream().sorted(Comparator.comparing(Commodity::getWidth)).collect(Collectors.toList());
		commodities.removeAll(commodities);
		commodities.addAll(h);
	}
	
	public void sortByWeight() {
		List<Commodity> h = commodities.stream().distinct().sorted(Comparator.comparing(Commodity::getWeight)).collect(Collectors.toList());
		commodities.removeAll(commodities);
		commodities.addAll(h);
	}
	
	public void printElement() {
		System.out.println("Write index");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(commodities.stream().collect(Collectors.toList()).get(n));
	}
	
	public void printAll() {
		commodities.stream().forEach(e -> System.out.println(e));
	}
	
}

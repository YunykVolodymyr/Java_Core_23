package ua.yunyk;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {

	public static void main(String[] args) {
			
			Set<Apple> set = new LinkedHashSet<>();
			set.add(new Apple("McIntosh", 3));
			set.add(new Apple("Cameo", 1));
			set.add(new Apple("Empire", 2));
			set.add(new Apple("Cortland", 7));
			set.add(new Apple("Fuji", 10));

			System.out.println("Unsorted set");
			System.out.println(set);
			System.out.println();
			System.out.println("Sorted by sort");
			set.stream().distinct().sorted(Comparator.comparing(Apple::getSort)).forEach(a -> System.out.println(a));
			System.out.println("Sorted by weight");
			set.stream().distinct().sorted(Comparator.comparing(Apple::getWeight)).forEach(a -> System.out.println(a));

	}
}

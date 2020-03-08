package ua.yunyk;

import java.util.Scanner;
import java.util.function.Consumer;

public class Deputy extends Human {

	private String lastName;
	private String firsName;
	private int age;
	private boolean bribeTaker;
	private int bribeSize;

	public Deputy(float height, float weight, String lastName, String firsName, int age, boolean bribeTaker) {
		super(height, weight);
		this.lastName = lastName;
		this.firsName = firsName;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	@Override
	public String toString() {
		return "Deputy [lastName=" + lastName + ", firsName=" + firsName + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", bribeSize=" + bribeSize + "]";
	}

	public void giveBribe() {
		if (isBribeTaker() == false)
			System.out.println("Цей депутат не бере хабарів");
		else {
			System.out.println("Введіть суму хабаря");
			Scanner s = new Scanner(System.in);
			int bribe = s.nextInt();
			Consumer<Integer> give = (Integer b) -> {
				if (b > 5000)
					System.out.println("Поліція ув'язнить депутата");
				else
					setBribeSize(getBribeSize() + b);
			};
			give.accept(bribe);
		}

	}

}
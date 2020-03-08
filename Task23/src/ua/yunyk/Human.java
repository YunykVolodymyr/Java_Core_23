package ua.yunyk;

public class Human {

	private float height;
	private float weight;
	
	public Human(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [height=" + height + ", weight=" + weight + "]";
	}
	
	
}
package ua.yunyk;

public class Apple implements Comparable<Apple>{

	private String sort;
	private int weight;
	
	public Apple(String sort, int weight) {
		super();
		this.sort = sort;
		this.weight = weight;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Apple [sort=" + sort + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(Apple o) {
		
		return this.sort.compareTo(o.sort);
	}
	
	
	
}
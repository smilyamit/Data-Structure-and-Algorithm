package greedyAlgorithms;

public class FractionalKnapsackItem {
	private int index;
	private int value;
	private int weight;
	private double ratio;

	//constructor
	public FractionalKnapsackItem(int index, int value, int weight) {
		this.index = index;
		this.value = value;
		this.weight = weight;
		ratio = value * 1.0 / weight;
	}//end of method
	

	public int getIndex() {
		return index;
	}//end of method

	
	public void setIndex(int index) {
		this.index = index;
	}//end of method
	

	public int getValue() {
		return value;
	}//end of method
	

	public void setValue(int value) {
		this.value = value;
	}//end of method
	

	public int getWeight() {
		return weight;
	}//end of method
	

	public void setWeight(int weight) {
		this.weight = weight;
	}//end of method
	

	public double getRatio() {
		return ratio;
	}//end of method

	
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}//end of method

	
	@Override
	public String toString() {
		return "Item index=" + index + ", value=" + value + ", weight=" + weight + ", ratio=" + ratio + "]";
	}//end of method

}//end of class

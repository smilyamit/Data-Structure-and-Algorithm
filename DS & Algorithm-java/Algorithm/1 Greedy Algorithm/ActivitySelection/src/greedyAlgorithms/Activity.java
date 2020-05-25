package greedyAlgorithms;

public class Activity {
	private String name;
	private int startTime;
	private int finishTime;

	//Constructor
	public Activity(String name, int startTime, int finishTime) {
		this.name = name;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}//end of method

	
	public String getName() {
		return name;
	}//end of method

	
	public void setName(String name) {
		this.name = name;
	}//end of method

	
	public int getStartTime() {
		return startTime;
	}//end of method
	

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}//end of method

	
	public int getFinishTime() {
		return finishTime;
	}//end of method

	
	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}//end of method
	

	@Override
	public String toString() {
		return "Activity :" + name + ", start time = " + startTime + ", finish time = " + finishTime;
	}//end of method

}//end of class

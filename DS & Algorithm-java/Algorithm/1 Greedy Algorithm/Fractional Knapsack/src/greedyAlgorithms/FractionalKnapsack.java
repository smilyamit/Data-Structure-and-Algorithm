package greedyAlgorithms;
import java.util.*;

public class FractionalKnapsack {

	
	static void knapSack(ArrayList<FractionalKnapsackItem> items, int capacity) {
		// Sort items by descending ratio of value/ weight
		//Implement Comparator interface and specify which variable('Ratio') of user defined class should the 'compare' method work on.
		//This needs to be done because this will be required in Sort method  
		Comparator<FractionalKnapsackItem> comparator = new Comparator<FractionalKnapsackItem>() {
			@Override
			public int compare(FractionalKnapsackItem o1, FractionalKnapsackItem o2) {
				if(o2.getRatio()>o1.getRatio())return 1;
				else return -1;
			}
		};
		
		
		//Sort all the objects stored in the Arraylist by 'Ratio' variable
		Collections.sort(items, comparator);
		
		
		//Run greedy algo
		int usedCapacity = 0;
		double totalValue = 0;
		for (FractionalKnapsackItem item : items) {
			//if full consumption possible then consume it
			if(usedCapacity+ item.getWeight()<=capacity) {
				usedCapacity+=item.getWeight();
				System.out.println("Taken: "+item);
				totalValue+=item.getValue();
			}
			else {
				//else consume fractionally
				int usedWeight = capacity - usedCapacity;
				double value = item.getRatio()*usedWeight;
				System.out.println("Taken: "+"item index = " + item.getIndex() + ",obtained value = " + value + ",used weight = " + usedWeight + ", ratio = " + item.getRatio()
						+ "]");
				usedCapacity+=usedWeight;
				totalValue+=value;
			}
			//if capacity is full then break
			if(usedCapacity==capacity)break;
		}
		//print finally obtained value
		System.out.println("\nTotal value obtained: "+ totalValue);
	}//end of method
	
}//end of class

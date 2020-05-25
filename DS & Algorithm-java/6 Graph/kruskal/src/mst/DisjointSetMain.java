package mst;
import java.util.ArrayList;
import node.WeightedNode;

public class DisjointSetMain {

	public static void main(String[] args) {
		
		// Constructor for ArrayList
		ArrayList<WeightedNode> nodeList = new ArrayList<>();

		// create 10 nodes: 1-10
		for (int i = 0; i < 10; i++) {
			nodeList.add(new WeightedNode("" + (char) (65 + i)));
		}

		// Calling DisjointSet
		DisjointSet.driver(nodeList);

	}// end of method
}// end of class
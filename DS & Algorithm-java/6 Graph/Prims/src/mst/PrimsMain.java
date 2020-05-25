package mst;
import java.util.ArrayList;
import node.WeightedNode;

public class PrimsMain {

	public static void main(String[] args) {
		ArrayList<WeightedNode> nodeList = new ArrayList<>();
		
		//Create 5 nodes: A,B,C,D,E
		for(int i=0;i<5; i++) {
			nodeList.add(new WeightedNode(""+(char)(65+i)));
		}
		
		Prims graph = new Prims(nodeList);
		graph.addWeightedUndirectedEdge(1,2,10); //Add undirected Edge between A-B with Weight 10
		graph.addWeightedUndirectedEdge(1,3,20); //Add undirected Edge between A-C with Weight 20
		graph.addWeightedUndirectedEdge(2,3,30); //Add undirected Edge between B-C with Weight 30
		graph.addWeightedUndirectedEdge(2,4,5);  //Add undirected Edge between B-D with Weight 5
		graph.addWeightedUndirectedEdge(3,4,15); //Add undirected Edge between C-D with Weight 15
		graph.addWeightedUndirectedEdge(3,5,6);  //Add undirected Edge between C-E with Weight 6
		graph.addWeightedUndirectedEdge(4,5,8);  //Add undirected Edge between D-E with Weight 8
		
		System.out.println("Printing Prim's Algo from source: E");
		graph.prims(nodeList.get(4));
		
	}//end of method

}//end of class
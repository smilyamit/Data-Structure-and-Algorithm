package bfs;

import java.util.ArrayList;

import node.GraphNode;

public class BFSByAdjacencyMatrixMain {

	public static void main(String[] args) {
		
		
		//Will store Nodes in this List
		ArrayList<GraphNode> nodeList = new ArrayList<>();
		
		
		//Create 10 nodes: V1-V10
		for(int i=1;i<11; i++) {
			nodeList.add(new GraphNode("V"+i,i-1));
		}
		
		
		//Pass Graph arraylist for further processing
		BFSByAdjacencyMatrix graph = new BFSByAdjacencyMatrix(nodeList);
		
		
		//Add edges in graph
		graph.addUndirectedEdge(1,2);
		graph.addUndirectedEdge(1,4);
		graph.addUndirectedEdge(2,3);
		graph.addUndirectedEdge(2,5);
		graph.addUndirectedEdge(3,6);
		graph.addUndirectedEdge(3,10);
		graph.addUndirectedEdge(4,7);
		graph.addUndirectedEdge(5,8);
		graph.addUndirectedEdge(6,9);
		graph.addUndirectedEdge(7,8);
		graph.addUndirectedEdge(8,9);
		graph.addUndirectedEdge(9,10);
		
		//bfs from v1
		System.out.println("Printing BFS from source: V1");
		graph.bfs();
	}

}

package graphUtil;

import node.WeightedNode;

public class UndirectedEdge {
private WeightedNode first;
private WeightedNode second;
private int weight;

public UndirectedEdge(WeightedNode first, WeightedNode second, int weight) {
	this.first = first;
	this.second = second;
	this.weight = weight;
}

public WeightedNode getFirst() {
	return first;
}
public void setFirst(WeightedNode first) {
	this.first = first;
}
public WeightedNode getSecond() {
	return second;
}
public void setSecond(WeightedNode second) {
	this.second = second;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}

@Override
public String toString() {
	return "Edge (" + first + "," + second + "), weight=" + weight + "]";
}

}

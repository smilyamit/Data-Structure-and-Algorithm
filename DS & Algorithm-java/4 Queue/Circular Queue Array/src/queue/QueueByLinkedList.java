package queue;

import linkedList.SingleLinkedList;

public class QueueByLinkedList {
	
	SingleLinkedList list;
	
	
	//constructor
	public QueueByLinkedList() {
		list = new SingleLinkedList();
	}//end of method

	
	public void enQueue(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			// push a value on last of queue, update list tail too
			list.insertInLinkedList(value, list.getSize());
		}
	}//end of method

	
	public int deQueue() {
		int value = -1;
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!");
		} else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}//end of method
	
	
	public int peek() {
		if (!isQueueEmpty())
			return list.getHead().getValue();
		else {
			System.out.println("The queue is empty!!");
			return -1;
		}
	}//end of method

	
	public boolean isQueueEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}//end of method
	
	
	public void deleteStack() {
		list.setHead(null);
	}//end of method

}//end of class

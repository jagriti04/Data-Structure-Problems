package com.bl.datastructure;

public class Queue <K extends Comparable<K>> {
	private final LinkedList<K> linkedList;

	public Queue() {
		this.linkedList = new LinkedList<K>();	
	}
	
	public void enqueue(INode<K> newNode) {
		linkedList.append(newNode);
	}

	public INode<K> peak() {
		return linkedList.head;
	}
	
	public void dequeue() {
		linkedList.popFirstNode();
	}
}

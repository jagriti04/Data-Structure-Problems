package com.bl.datastructure;

public class Stack {
	private final LinkedList linkedList;

	public Stack() {
		this.linkedList = new LinkedList();	
	}

	public void push(INode myNode) {
		linkedList.add(myNode);
	}

	public INode peak() {
		// TODO Auto-generated method stub
		return linkedList.head;
	}

}

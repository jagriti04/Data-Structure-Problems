package com.bl.datastructure;

public class Stack<K extends Comparable<K>> {
	private final LinkedList<K> linkedList;

	public Stack() {
		this.linkedList = new LinkedList<K>();	
	}

	public void push(INode<K> node) {
		linkedList.add(node);
	}

	public INode<K> peak() {
		// TODO Auto-generated method stub
		return linkedList.head;
	}
	
	public void pop() {
		linkedList.popFirstNode();
		System.out.println("after stack pop");
		linkedList.printLinkedList();
	}

}

package com.bl.datastructure;

public class LinkedList {
	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	// add element(Node) to the linked list
	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// append node to the linked List
	public void append(INode newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// Insert nodes between nodes
	public void insert(INode firstNode, INode newNode) {
		INode tempNode = firstNode.getNext();
		firstNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
}

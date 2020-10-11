package com.bl.datastructure;

public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	// add element(Node) to the linked list
	public void add(INode<K> newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// append node to the linked List
	public void append(INode<K> newNode) {
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

	// delete first node
	public void pop() {
		if (this.head == null) {
			System.out.println("Empty linked list");
		} else {
			INode<K> tempNode = this.head;
			this.head = tempNode.getNext();
		}
	}

	// delete last node
	public void popLastNode() {
		printLinkedList();
		if (this.head == null && this.tail == null) {
			System.out.println("Empty linked list");
		} else {
			INode<K> tempNode = this.head;
			while (tempNode.getNext() !=  this.tail) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
			printLinkedList();
		}
	}
	
	// search linked list to find an element
	public INode<K> findNode(K key) {
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getKey() == key) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		System.out.println("No such node");
		return null;
	}
	
	// print the linked list
	public void printLinkedList() {
		INode<K> tempNode = this.head;
		int nodeNum = 1;
		while (tempNode != null) {
			System.out.println(nodeNum + " "+ tempNode.getKey());
			tempNode = tempNode.getNext();
			nodeNum++;
		}
	}
}

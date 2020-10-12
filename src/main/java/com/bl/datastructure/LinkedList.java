package com.bl.datastructure;

public class LinkedList<K extends Comparable<K>> {
	public INode<K> head;
	public INode<K> tail;
	private int linkedListSize;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		linkedListSize = 0;
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
		linkedListSize++;
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
		linkedListSize++;
	}

	// Insert nodes between nodes
	public void insert(INode<K> firstNode, INode<K> newNode) {
		INode<K> tempNode = firstNode.getNext();
		firstNode.setNext(newNode);
		newNode.setNext(tempNode);
		linkedListSize++;
	}

	// delete first node
	public void popFirstNode() {
		if (this.head == null) {
			System.out.println("Empty linked list");
		} else {
			INode<K> tempNode = this.head;
			this.head = tempNode.getNext();
		}
		linkedListSize--;
	}

	// delete last node
	public void popLastNode() {
		if (this.head == null && this.tail == null) {
			System.out.println("Empty linked list");
		} else {
			INode<K> tempNode = this.head;
			while (tempNode.getNext() != this.tail) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
		}
		linkedListSize--;
	}

	// delete the given node
	public void deleteGivenNode(INode<K> givenNode) {
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getNext() == givenNode) {
				tempNode.setNext(givenNode.getNext());
			}
			tempNode = tempNode.getNext();
		}
		linkedListSize--;
	}

	// get size of linkedList
	public int getSize() {
		return linkedListSize;
	}

	// search linked list to find an element
	public INode<K> findNode(K key) {
		if (head == null) {
			return null;
		}
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		System.out.println("No such node");
		return null;
	}

	// add in ascending order (UC10- sorted linked list)
	public void addInAscendingOrder(INode<K> newNode) {
		System.out.println(newNode.getKey());
		if (this.head == null) {
			this.head = newNode;
		} else if (this.head.getKey().compareTo(newNode.getKey()) > 0) {
			newNode.setNext(head);
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			while (tempNode.getNext() != null && tempNode.getNext().getKey().compareTo(newNode.getKey()) < 0) {
				tempNode = tempNode.getNext();
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
		System.out.println("---after inserting in ascending order ---");
		printLinkedList();
		INode<K> tempNode = this.head;
		while (tempNode.getNext() != null)
			tempNode = tempNode.getNext();
		this.tail = tempNode;
	}

	// print the linked list
	public void printLinkedList() {
		INode<K> tempNode = this.head;
		int nodeNum = 1;
		while (tempNode != null) {
			System.out.println(nodeNum + " " + tempNode.getKey());
			tempNode = tempNode.getNext();
			nodeNum++;
		}
		return;
	}
}

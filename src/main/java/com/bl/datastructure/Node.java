package com.bl.datastructure;

public class Node <K> {
	private K key;
	private Node next;
	
	// constructor
	public Node(K key) {
		this.key = key;
		this.next = null;
	}
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public static boolean printWelcomeMsg() {
		System.out.println("Welcome to the find maximum using generics problem.");
		return true;
	}
}

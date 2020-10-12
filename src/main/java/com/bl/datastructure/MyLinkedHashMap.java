package com.bl.datastructure;

import java.util.ArrayList;

public class MyLinkedHashMap<K extends Comparable<K>, V> {
	private final int numBuckets;
	ArrayList<LinkedList<K>> myBucketArray;

	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		for (int i = 0; i < numBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	// implements hash function to find index
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}

	// get values corresponding to a key
	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.findNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new LinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.findNode(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}
	
	// to delete a given word
	public K deleteWord(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			System.out.println("word not present");
			return null;
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.deleteGivenKey(key);
		return (myMapNode == null) ? null : myMapNode.getKey();
	}
	
	@Override
	public String toString() {
		return "MyLinkedHashMap List{" + myBucketArray + "}";
	}
}

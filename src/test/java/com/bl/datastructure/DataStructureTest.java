package com.bl.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class DataStructureTest {
	@Test
	public void whenCallWelcomeMethod_shouldReturnTrue() {
		boolean welcomeReturns = Node.printWelcomeMsg();
		Assert.assertEquals(true, welcomeReturns);
	}

	//UC1 test case to create simple linked list
	@Test
	public void givenThreeElements_whenLinked_shouldPassLinkedListTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}
	
	// UC2 Linked list test
	@Test
	public void given3elementsWhenLinkedShouldBeAddedToTop() {
		Node<Integer> thirdNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> firstNode = new Node<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
	}
}

package com.bl.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class DataStructureTest {
	@Test
	public void whenCallWelcomeMethod_shouldReturnTrue() {
		boolean welcomeReturns = Node.printWelcomeMsg();
		Assert.assertEquals(true, welcomeReturns);
	}

	// UC1 test case to create simple linked list
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

	// UC2 Linked list add node test
	@Test
	public void givenThreeElements_whenLinked_shouldBeAddedToTop() {
		Node<Integer> thirdNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> firstNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
	}

	// UC3 Linked list append node test
	@Test
	public void givenThreeElements_whenLinked_shouldBeAddedAtEnd() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	// UC4 insert a node between two nodes
	@Test
	public void givenTwoNodes_shouldInsertThirdNodeBetweenThem() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(firstNode);
		linkedList.append(thirdNode);
		linkedList.insert(firstNode, secondNode);
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	// UC5 delete first node of linked list
	@Test
	public void givenThreeNode_shouldDeleteFirstNode() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.popFirstNode();
		boolean result = linkedList.head.equals(secondNode) && linkedList.head.getNext().equals(thirdNode)
				&& linkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	// UC6 delete last node of linked list
	@Test
	public void givenThreeNode_shouldDeleteLastNode() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.popLastNode();
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(secondNode);
		Assert.assertTrue(result);
	}

	// UC7 find the node with given key value
	@Test
	public void givenKeyValue_shouldReturnNodeWithKey() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		INode<Integer> resultNode = linkedList.findNode(30);
		boolean result = resultNode.equals(secondNode);
		Assert.assertTrue(result);
	}

	// UC8 find the node with given key value and insert a new node
	@Test
	public void givenThreeNodes_findANode_shoudlInsertNewNode() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		INode<Integer> nodeFound = linkedList.findNode(30);
		Node<Integer> newNode = new Node<>(40);
		linkedList.insert(nodeFound, newNode);
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.head.getNext().getNext().equals(newNode) && linkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	// UC9 find the node delete it and print the size of final linked list
	@Test
	public void givenFourNodes_findANode_deleteIt_shouldReturnSizeOfLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(40);
		Node<Integer> fourthNode = new Node<>(70);
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.append(fourthNode);

		INode<Integer> nodeFound = linkedList.findNode(40);
		linkedList.deleteGivenNode(nodeFound);
		int size = linkedList.getSize();
		Assert.assertEquals(size, 3);
	}

	// UC10 make a sorted linked list
	@Test
	public void givenFourNodes_shouldAddNodeInAscendingOrder() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(40);
		Node<Integer> fourthNode = new Node<>(70);
		linkedList.addInAscendingOrder(firstNode);
		linkedList.addInAscendingOrder(secondNode);
		linkedList.addInAscendingOrder(thirdNode);
		linkedList.addInAscendingOrder(fourthNode);

		boolean result = linkedList.head.equals(secondNode) && linkedList.head.getNext().equals(thirdNode)
				&& linkedList.head.getNext().getNext().equals(firstNode) && linkedList.tail.equals(fourthNode);
		Assert.assertTrue(result);
	}
}

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
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}

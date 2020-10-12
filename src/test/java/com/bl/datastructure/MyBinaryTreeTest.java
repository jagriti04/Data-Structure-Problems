package com.bl.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
	
	// add elements in BST using binary tree node and calculating size of BST
	@Test
	public void givenThreeNumbers_whenAddedToBST_shouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}

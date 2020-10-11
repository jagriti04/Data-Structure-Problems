package com.bl.datastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DataStructureTest {
	DataStructure dataStructure = null;

	@Before
	public void initialize() {
		dataStructure = new DataStructure();
	}

	@Test
	public void whenCallWelcomeMethod_shouldReturnTrue() {
		boolean welcomeReturns = dataStructure.printWelcomeMsg();
		Assert.assertEquals(true, welcomeReturns);
	}
}

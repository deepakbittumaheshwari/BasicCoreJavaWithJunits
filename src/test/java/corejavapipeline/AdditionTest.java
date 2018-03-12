package corejavapipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import deepak.basic.Addition;

public class AdditionTest {

	@Test
	public void testAdd() {
		   Addition add = new Addition();
		   int result= add.add(1, 3);
	      assertEquals(4,result);
	   }
}

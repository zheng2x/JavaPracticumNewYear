package org.l2csl.beginnerjava.newyear;


import static org.junit.Assert.*;

import org.junit.Test;

class MainTest {
	@Test
	public void testAdd() throws Exception {
//		Main m = new Main();
//		int sum =m.add(2, 4);
//		assertEquals(sum, 6);
//		
//		int sum2 = m.add(-3, 7);
//		assertEquals(sum2, 4);
		
		int sum = Main.add(2, 4);
		assertEquals(sum, 6);
		
	}

}
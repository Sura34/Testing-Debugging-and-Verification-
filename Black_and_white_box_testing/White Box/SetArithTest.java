package main.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetArithTest {

	@Test
	public void test() {
		Set set = new Set();
		set.insert(8);
		set.insert(2);
		set.insert(5);
		assertEquals(true,set.containsArithTriple());
		
	}
	
	@Test
	public void containsOne() {
		Set set_2 = new Set();
		set_2.insert(1);
		assertFalse(set_2.containsArithTriple());
	}
	

}

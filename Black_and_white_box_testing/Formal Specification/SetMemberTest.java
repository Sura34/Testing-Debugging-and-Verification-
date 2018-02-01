package main.java;
import static org.junit.Assert.*;
import org.junit.Test;


public class SetMemberTest {

	@Test
	public void testMember() {
		Set new_set = new Set();
		
		new_set.insert(7);
		new_set.insert(10);
		new_set.insert(11);
		assertEquals(true,new_set.member(10));
        assertEquals(false,new_set.member(9));
	}

}

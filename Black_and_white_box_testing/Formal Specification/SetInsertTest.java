package main.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SetInsertTest {
	public void assertList(ArrayList<Integer> expected_arrayList, Set our_set) {
        //Make sure that the expected ArrayList has the same length as the actual Set
    	assertEquals(expected_arrayList.size(), our_set.a.size());
        if (expected_arrayList.size() == 0) assertTrue(our_set.a.isEmpty());
        else assertFalse(our_set.a.isEmpty());
        for (int i = 0; i < expected_arrayList.size(); i++)
            //Make sure every element is equal 
        	assertEquals(expected_arrayList.get(i), our_set.a.get(i));

    }
	
	@Test
	public void testInsert() {
		//Test the insert function
				Set set = new Set();
				set.insert(7);
		        ArrayList<Integer> expected = new ArrayList<Integer>();
		        expected.add(7);
		       
		        assertList(expected,set);
				set.insert(5);
		        ArrayList<Integer> expected2 = new ArrayList<Integer>();
		        expected2.add(5);
		        expected2.add(7);
		        assertList(expected2,set);
				set.insert(7);
				set.insert(8);
				ArrayList<Integer> expected3 = new ArrayList<Integer>();
		        expected3.add(5);
		        expected3.add(7);
		        expected3.add(8);
		        assertList(expected3,set);
			
		        }

}

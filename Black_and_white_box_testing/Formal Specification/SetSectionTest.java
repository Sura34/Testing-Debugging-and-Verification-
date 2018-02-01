package main.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SetSectionTest {
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
	public void testSection() {
		Set set = new Set();
		
		set.insert(7);
		set.insert(10);
		set.insert(11);
		set.insert(12);
		
		Set section_ = new Set();
		section_.insert(11);
		section_.insert(12);
		//This is the line we added to be able to achieve statement coverage
		section_.insert(5);
		
		set.section(section_);
		
		Set expected = new Set();
		expected.insert(7);
		expected.insert(10);
		

		
		assertList(expected.a,set);
		
		
	
	
	}

}

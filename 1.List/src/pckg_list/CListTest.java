package pckg_list;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CListTest {

	@Test
	void test_list_trunk() {
		CList list = new CList();
		
		list.add("aaaa");
		String text1 = list.toString();
		assertEquals(text1, "aaaa");
		
		list.rmv(0);
		String text2 = list.toString();
		assertEquals(text2, "");
		return;
	}
	
	@Test
	void test_list_add() {
		CList list = new CList();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("dddd");
		list.add("eeee");
		String text1 = list.toString();
		assertEquals(text1, "aaaa,bbbb,cccc,dddd,eeee");
		
		list.rmv(0);
		list.rmv(2);
		list.rmv(2);
		list.rmv(2);
		String text2 = list.toString();
		assertEquals(text2, "bbbb,cccc");

		return;		
	}

	@Test
	void test_list_insert() {
		CList list = new CList();
		
		try {
			list.insert(0, "aaaa");
			list.add("cccc");
			list.insert(1, "bbbb");
			list.insert(3, "dddd");		
			String text1 = list.toString();
			assertEquals(text1, "aaaa,bbbb,cccc,dddd");
		}
		catch(Exception ex){
			if(ex.getMessage() != CList.EXP_OUT_OF_RANGE){
				fail("Exception thrown: "+ex.getMessage());
			}
		}
		return;		
	}

	@Test
	void test_list_exception() {
		CList list = new CList();
		
		try {
			list.insert(5, "aaaa");
			fail("Exception not thrown: " + CList.EXP_OUT_OF_RANGE);
		}
		catch(Exception ex){
			if(ex.getMessage() != CList.EXP_OUT_OF_RANGE){
				fail("Exception thrown: "+ex.getMessage());
			}
		}
		return;		
	}

}



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.struts.*;

public class TestLogic {
	Calculation c = new Calculation();
	
	//This method is to test the maximum number 
	@Test
	public void testfindmax(){
		
		assertEquals(4,c.findMax(new int[]{1,3,4,2}));
		assertEquals(0,c.findMax(new int[]{-43,-1,-9,-96}));
	}
	
	//This method checks how many times the given string is present in string array.
	@Test
	public void testStringArray(){
		assertEquals(1,c.calculateString("anant"));
		assertEquals(2,c.calculateString("amit"));
		assertEquals(-1,c.calculateString("anuja"));
	}
	
}

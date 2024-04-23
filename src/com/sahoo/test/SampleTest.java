package com.sahoo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sahoo.code.Calculator;

public class SampleTest {

	@Test
	public void testAddPositive()
	{
	    
	    Calculator c = new Calculator();
	    int res = c.add(100, 200);
	     
	    Assertions.assertEquals(300, res);
	}
	@Test
	public void testAddNegative()
	{
	    
	    Calculator c = new Calculator();
	    int res = c.add(-100, -200);
	     
	    Assertions.assertEquals(-300, res);
	}
	@Test
	public void testAddMixed()
	{
	    
	    Calculator c = new Calculator();
	    int res = c.add(-100, 200);
	     
	    Assertions.assertEquals(100, res);
	}
	@Test
	public void testAddWithZero()
	{
	    
	    Calculator c = new Calculator();
	    int res = c.add(0, 200);
	     
	    Assertions.assertEquals(200, res);
	}
	
	
}

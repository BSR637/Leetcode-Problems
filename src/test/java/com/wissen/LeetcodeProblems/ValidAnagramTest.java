package com.wissen.LeetcodeProblems;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ValidAnagramTest {
	
	String string1,string2;
	
	public ValidAnagramTest(String string1, String string2)
	{
		super();
		this.string1 = string1;
		this.string2 = string2;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> input()
	{
		String[] input1 = {"anagram","nagaram"};
		String[] input2 = {"rat","car"};
		String[] input3 = {"arc","car"};
		String[] input4 = {"state","taste"};	
		return Arrays.asList(new Object[][] {input1,input2,input3,input4});
	}	

	@Test
	public void testValidAnagram()
	{
		ValidAnagram validAnagram = new ValidAnagram();
		assertTrue(validAnagram.isAnagram(string1,string2));
	}
}

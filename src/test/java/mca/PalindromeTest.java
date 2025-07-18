package mca;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class PalindromeTest 
{
	@Test
	public void testApp()
	{
		Hello h = new Hello();
		String expected = "aba";
		String actual = h.palindrome(expected);
		
		Assert.assertEquals(expected, actual);
	}
}

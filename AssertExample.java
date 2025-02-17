package testCase1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertExample {
	public static boolean isEmpty(final CharSequence cs)
	{
		return cs==null|cs.length()==0;

	}
	public static boolean isBlank(final CharSequence cs)
	{
		int strLen;
		if(cs==null||(strLen=cs.length())==0)
		{
			return true;
		}
		for(int i=0;i<strLen;i++)
		{
			if(!character.isWhitespace(cs.charAt(i)))
			{
				return false;
			}
		}
		return true;
		
	}
	

	@Test
	public void isEmptytest() {
		assertTrue(isEmpty(null));
		assertTrue(isEmpty(""));
		assertTrue(isEmpty(" "));
		assertTrue(isEmpty("aiml-b"));
		assertTrue(isEmpty(" aiml-b "));
		
		
		
	}
	@Test
	public void isBlanktest()
	{
		assertTrue(isBlank(null));
		assertTrue(isBlank(""));
		assertTrue(isBlank(" "));
		assertTrue(isBlank("aiml-b"));
		assertTrue(isBlank(" aiml-b "));
	}

}

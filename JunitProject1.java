package testCase1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitProject1 {

	@Test
	public void test_Junit() {
		System.out.println("check the string");
		String str ="check the string";
		assertEquals("check the string",str);
		//fail("Not yet implemented");
	}

}

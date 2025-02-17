package testCase1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {
	public int square(int n)
	{
		return n*n;
	}

	@Test
	public void test() {
		Test1 obj1=new Test1();
		int Output_f=obj1.square(3);
		assertEquals(9,Output_f);
		//fail("Not yet implemented");
	}

}

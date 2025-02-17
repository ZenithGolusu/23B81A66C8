package testCase1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit1 {
String message="hello";
MsgUnit messageUnit=new MsgUnit(message);


	@Test
	public void testprintMessage() {
		assertEquals(message,messageUnit.printMessage());
		
		//fail("Not yet implemented");
		
		
	}

}

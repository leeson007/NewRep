package Junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class AssertDemo {
	@Test
	public void test(){
		String name="leeson";
		assertTrue("����������ַ�1",name.contains("4"));
		assertEquals("����������ַ�2","leeson", "love");
	}
}

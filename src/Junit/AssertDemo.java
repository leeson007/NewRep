package Junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class AssertDemo {
	@Test
	public void test(){
		String name="leeson";
		assertTrue("不包含这个字符1",name.contains("4"));
		assertEquals("不包含这个字符2","leeson", "love");
	}
}

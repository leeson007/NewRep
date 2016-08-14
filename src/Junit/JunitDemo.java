package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitDemo {
	@Before
	public void setUp(){
		System.out.println("before");
	}
	@After
	public void tearDown(){
		System.out.println("after");
	}
	@Test
	public void test01(){
		System.out.println("test");
	}
}

package Junit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Btest {
	@Category(Fast.class)//标识这个方法(category中用到)
	@Test
	public void B1(){
		System.out.println("B1");
	}
	@Category(Slow.class)//标识这个方法(category中用到)
	@Test
	public void b2(){
		System.out.println("B2");
	}
}

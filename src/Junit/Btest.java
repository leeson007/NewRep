package Junit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Btest {
	@Category(Fast.class)//��ʶ�������(category���õ�)
	@Test
	public void B1(){
		System.out.println("B1");
	}
	@Category(Slow.class)//��ʶ�������(category���õ�)
	@Test
	public void b2(){
		System.out.println("B2");
	}
}

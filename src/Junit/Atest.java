package Junit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({Fast.class,Slow.class}) //��ʶ�����  (category���õ�)
public class Atest {
	@Test
	public void a1(){
		System.out.println("A1");
	}
	
	@Test
	public void a2(){
		System.out.println("A2");
	}
}

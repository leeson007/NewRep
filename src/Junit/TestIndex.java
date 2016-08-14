package Junit;

import org.junit.Test;

/*
 * 方法二 加了个index  用作排序的序号
 * 测试方法类
 */
public class TestIndex {
	@Index(value=1)
	@Test
	public void aTest(){
		System.out.println("aTest");
	}
	@Index(value=3)
	@Test
	public void cTest(){
		System.out.println("cTest");
	}
	@Index(value=2)
	@Test
	public void bTest(){
		System.out.println("bTest");
	}
	@Index(value=5)
	@Test
	public void eTest(){
		System.out.println("eTest");
	}
	@Index(value=4)
	@Test
	public void dTest(){
		System.out.println("dTest");
	}
}

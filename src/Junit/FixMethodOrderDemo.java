package Junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/*
 * 测试方法的执行 顺序
 * 方法一：如下
 * 方法二：
 */
@FixMethodOrder(value=MethodSorters.NAME_ASCENDING)//不同的值，有不同的顺序方法 JVM，NAME_ASCENDING...
public class FixMethodOrderDemo {
	@Test
	public void aTest(){
		System.out.println("aTest");
	}
	@Test
	public void cTest(){
		System.out.println("cTest");
	}
	@Test
	public void bTest(){
		System.out.println("bTest");
	}
	@Test
	public void dTest(){
		System.out.println("dTest");
	}
}

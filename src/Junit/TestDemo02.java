package Junit;


import org.junit.Test;

/*
 * test中的expected和timeout
 * 1.异常检测为正确
 * 2.
 */
public class TestDemo02 {
	@Test(expected=ArithmeticException.class)
	public void testExpected(){//制造一个抛出异常
		int i=1;
		int n=0;
		double res=i/n;
	}
	@Test(timeout=5000)//设置超时为5秒
	public void testTimeout(){
		try{
			Thread.sleep(6000); //程序等待了6秒  （此时系统将抛出睡眠被打断异常），通常做性能测试
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

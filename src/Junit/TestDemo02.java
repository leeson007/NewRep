package Junit;


import org.junit.Test;

/*
 * test�е�expected��timeout
 * 1.�쳣���Ϊ��ȷ
 * 2.
 */
public class TestDemo02 {
	@Test(expected=ArithmeticException.class)
	public void testExpected(){//����һ���׳��쳣
		int i=1;
		int n=0;
		double res=i/n;
	}
	@Test(timeout=5000)//���ó�ʱΪ5��
	public void testTimeout(){
		try{
			Thread.sleep(6000); //����ȴ���6��  ����ʱϵͳ���׳�˯�߱�����쳣����ͨ�������ܲ���
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

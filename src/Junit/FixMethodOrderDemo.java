package Junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/*
 * ���Է�����ִ�� ˳��
 * ����һ������
 * ��������
 */
@FixMethodOrder(value=MethodSorters.NAME_ASCENDING)//��ͬ��ֵ���в�ͬ��˳�򷽷� JVM��NAME_ASCENDING...
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

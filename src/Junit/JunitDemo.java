package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * ִ�е�˳��ʹ�ʱ
 * 
 * 1.����test��������  ����ֵ������ʵ������name��
 * 2.�����ĳֵ������test�ж�����   ��������Ϊȫ�ֱ���static;
 */
public class JunitDemo {
	public static String name;
	public /*static */String password;
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
		System.out.println("test01:"+name);
	}
	@Test
	public void test02(){
		
		System.out.println("test02:"+name);
	}
	@BeforeClass
	public static void beforeclass(){
		name="Leeson";
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public static void afterclass(){
		System.out.println("afterclass");
	}
}

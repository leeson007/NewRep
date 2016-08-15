package Junit.DataDriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/*
 * ���ԣ��������û���������е�¼����      parameter
 */

@RunWith(Parameterized.class) //����������
public class ParameterDemo {
	private String username;
	private String password;
	
	public ParameterDemo(String username,String password) {//���캯��   ������ʼ������  
		this.username=username;
		this.password=password;
	} 
	
	@Parameters//�����ʶһ����̬����  ����ֵ������Collection���� �洢String����
	public static Collection<String[]> getData(){//����λ�����飬תΪΪһά���飬����ȥ����һ�����û�����¼����	
		return Arrays.asList(new String[][]{{"leeson","123456"},{"sonlee","654321"},{"lee","123"}});
	}
	
	@Test
	public void testparameter(){
		System.out.println(username+"-->"+password);
	}
}

package Junit.DataDriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/*
 * ��ȡcsv �����ݿ��е�������Ϊ����Դ���в��ԣ�DBUtils��
 * csv �����ı��ļ�
 */

@RunWith(Parameterized.class) //����������
public class ParameterDemo2 {
	private String username;
	private String password;
	
	public ParameterDemo2(String username,String password) {//���캯��   ������ʼ������  
		this.username=username;
		this.password=password;
	} 
	
	@Parameters//�����ʶһ����̬����  ����ֵ������Collection���� �洢String����
	public static Collection<String[]> getData(){//����λ�����飬תΪΪһά���飬����ȥ����һ�����û�����¼����	
		return DBUtils.scvDriver("C:\\Users\\leeson\\git\\NewRep\\src\\Junit\\DataDriver\\userInfo.csv");  //�������ݵľ��Ե�ַ  ��Ҳ���������·��
	}
	
	@Test
	public void testparameter(){
		System.out.println(username+"-->"+password);
	}
}

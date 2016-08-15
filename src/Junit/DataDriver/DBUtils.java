package Junit.DataDriver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/*
 * csv����+JDBC����
 */

public class DBUtils {
	public static List<String[]> scvDriver(String filepath){
		List<String[]> list =new ArrayList<String[]>();
		BufferedReader buf=null;
		InputStream in =null;
		try {
			in =new FileInputStream(filepath);
			buf =new BufferedReader(new InputStreamReader(in)); //���ļ�������д��buf��
			String temp=null;  
			while(!(temp=StringUtils.trimToEmpty(buf.readLine())).equals("")){  //readLine()��ȡ��һ�е����� ,StringUtils.trimToEmpty()�ж϶�ȡ ������  ���лس� ת��Ϊ�յ��ַ�������Ϊ�յ�ʱ��ѭ��
				String user[]=temp.split(" "); //���ÿ����Ϣ������
				list.add(user);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				buf.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}

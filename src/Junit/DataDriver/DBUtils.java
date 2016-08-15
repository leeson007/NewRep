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
 * csv驱动+JDBC驱动
 */

public class DBUtils {
	public static List<String[]> scvDriver(String filepath){
		List<String[]> list =new ArrayList<String[]>();
		BufferedReader buf=null;
		InputStream in =null;
		try {
			in =new FileInputStream(filepath);
			buf =new BufferedReader(new InputStreamReader(in)); //将文件的内容写进buf中
			String temp=null;  
			while(!(temp=StringUtils.trimToEmpty(buf.readLine())).equals("")){  //readLine()读取第一行的数据 ,StringUtils.trimToEmpty()判断读取 的数据  空行回车 转化为空的字符串，不为空的时候循环
				String user[]=temp.split(" "); //拆分每行信息成数组
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

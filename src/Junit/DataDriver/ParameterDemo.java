package Junit.DataDriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/*
 * 测试：将三个用户名密码进行登录测试      parameter
 */

@RunWith(Parameterized.class) //引入运行器
public class ParameterDemo {
	private String username;
	private String password;
	
	public ParameterDemo(String username,String password) {//构造函数   用来初始化参数  
		this.username=username;
		this.password=password;
	} 
	
	@Parameters//必须标识一个静态方法  返回值必须是Collection集合 存储String类型
	public static Collection<String[]> getData(){//将二位的数组，转为为一维数组，返回去进行一个个用户名登录测试	
		return Arrays.asList(new String[][]{{"leeson","123456"},{"sonlee","654321"},{"lee","123"}});
	}
	
	@Test
	public void testparameter(){
		System.out.println(username+"-->"+password);
	}
}

package Junit.DataDriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/*
 * 读取csv 或数据库中的数据作为数据源进行测试（DBUtils）
 * csv 类似文本文件
 */

@RunWith(Parameterized.class) //引入运行器
public class ParameterDemo2 {
	private String username;
	private String password;
	
	public ParameterDemo2(String username,String password) {//构造函数   用来初始化参数  
		this.username=username;
		this.password=password;
	} 
	
	@Parameters//必须标识一个静态方法  返回值必须是Collection集合 存储String类型
	public static Collection<String[]> getData(){//将二位的数组，转为为一维数组，返回去进行一个个用户名登录测试	
		return DBUtils.scvDriver("C:\\Users\\leeson\\git\\NewRep\\src\\Junit\\DataDriver\\userInfo.csv");  //测试数据的绝对地址  、也可以用相对路径
	}
	
	@Test
	public void testparameter(){
		System.out.println(username+"-->"+password);
	}
}

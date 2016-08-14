package Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/*
 * 同时运行ＡＢ两个测试类的方法
 */
@RunWith(Suite.class)
@SuiteClasses({Atest.class,Btest.class}) //数组 两个测试类包

public class SuiteDemo {
	
}

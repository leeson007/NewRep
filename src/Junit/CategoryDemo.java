package Junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * 指定运行那个类或者哪个类的那个方法
 */
@IncludeCategory(Fast.class)  //执行 被这个声明标识的类或方法
@RunWith(Categories.class)
@SuiteClasses({Atest.class,Btest.class}) //数组  加入两个测试类包
public class CategoryDemo {

}
interface Fast{} //声明两个标志
interface Slow{}
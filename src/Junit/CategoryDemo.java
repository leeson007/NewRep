package Junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * ָ�������Ǹ�������ĸ�����Ǹ�����
 */
@IncludeCategory(Fast.class)  //ִ�� �����������ʶ����򷽷�
@RunWith(Categories.class)
@SuiteClasses({Atest.class,Btest.class}) //����  ���������������
public class CategoryDemo {

}
interface Fast{} //����������־
interface Slow{}
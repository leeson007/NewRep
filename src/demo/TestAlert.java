package demo;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAlert {
	@Test
	public void test(){
		/*
		 * 获取js窗口，点击确认按钮，获取弹窗内容，设置断言
		 */
		WebDriver driver = new FirefoxDriver();
		driver.get("a url who have alert element");
		WebElement alert = driver.findElement(By.id("alert"));
		alert.click();
		Alert temp = driver.switchTo().alert();// Send future commands to a different frame or window
		temp.accept();//如果超时保持，则设一个检查点 
		String content = temp.getText();
		assertTrue(content.equals("something"));
			
	}
	/*
	 * 获取新窗口 进行操作
	 */
	@Test
	public void testwindow(){
		WebDriver driver = new FirefoxDriver();
		driver.get("a url who have new window element");
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("new pear button")).click();
		
		
		Set<String> all = driver.getWindowHandles();
		Iterator<String> iter = all.iterator();
		String temp;
		while(iter.hasNext()){
			temp=iter.next();
			if(!temp.equals(parent)){
				driver.switchTo().window(temp);
			}
		}
		
	}
}//i want to fuck you

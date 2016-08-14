package Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.JUnit4;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;

@RunWith(BlockJUnit4ClassRunner.class)
/*
 * 指定方法
 * BlockJUnit4ClassRunner.class
 * JUnit4.class
 */

public class RunnerDemo {
	@Test
	public void demo(){
		System.out.println("****");
	}
	@Test
	public void demo2(){
		System.out.println("----");
	}
}

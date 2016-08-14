package Junit;

/*
 * 执行方法排序的方法二
 * 比较复杂，写一次就够了
 * 以后直接用就可以了
 * 函数方法
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

public class SortedRunner extends BlockJUnit4ClassRunner{

	public SortedRunner(Class klass) throws InitializationError {
		super(klass);
	}
	@Override
	protected List<FrameworkMethod> computeTestMethods(){
		List<FrameworkMethod> list = super.computeTestMethods();
		Collections.sort(list,new Comparator<FrameworkMethod>() {
			public int compare(FrameworkMethod f1, FrameworkMethod f2) {
				Index o1 = f1.getAnnotation(Index.class);
				Index o2 = f2.getAnnotation(Index.class);
				if(o1==null||o2==null)
					return -1;
				return o1.value() - o2.value();
			}
		});
		return list;
	}

}

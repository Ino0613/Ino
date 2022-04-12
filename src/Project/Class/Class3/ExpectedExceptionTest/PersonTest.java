package Project.Class.Class3.ExpectedExceptionTest;

import org.junit.Test;
//使用junit4通过
public class PersonTest {

	//@Ignore
	@Test(expected = IllegalArgumentException.class)
	public void testExpectedException1() {
		new Person("Joe",25);  //显示failures,表示没有发出异常
		//new Person("Joe",-1);	//通过测试 ,表示发出异常
	}
	@Test(expected = RuntimeException.class)
	public void testExpectedException2() {
		Person per1=new Person("Joe",25);
		//per1.Add(115, 6);	//通过测试,表示发出异常
		per1.Add(5, 6);	//显示failures,表示没有发出异常
	}
}
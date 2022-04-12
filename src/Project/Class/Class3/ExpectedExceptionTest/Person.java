package Project.Class.Class3.ExpectedExceptionTest;

public class Person {
	private final String name;
	private final int age;
	/**
	 * Creates a person with the specified name and age.	
	 * @throws IllegalArgumentException if the age is not greater than zero
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		if (age <= 0) {
			throw new IllegalArgumentException("Invalid age:" + age);
		}
	}
	public int Add(int left_number,int right_number){
		if (left_number>100 || right_number>100){
			throw new RuntimeException("运算数 不在100范围");
		}
		return left_number+right_number;
	}

	public static void main(String[] args) {

		Person  per1 = new Person("张三",21);
		System.out.println("姓名："+per1.name+"；年龄："+per1.age);
	}
}

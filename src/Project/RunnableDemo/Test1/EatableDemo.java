package Project.RunnableDemo.Test1;
/*
    Lambda表达式的格式： （形式参数） -> {代码块}

    1.定义一个接口(Eatable),里面定义一个抽象方法: void eat();
    2.定义一个测试类(EatableDemo)，在测试类中提供两个方法
        useEatable(Eatable e)
        主方法 调用useEatable
 */
public class EatableDemo {
    public static void main(String[] args) {
        Eatable e = new EatableImpl();
        useEatable(e);

        useEatable(new Eatable() {

            @Override
            public void eat() {
                System.out.println("222");
            }
        });
        useEatable(() -> {
            System.out.println("333");
        });
    }
    public static void useEatable(Eatable e){
        e.eat();
    }

}


package Project.MyMethodReference.Test1;

/*
    练习:
        1.定义一个接口(Converter),里面定义一个抽象方法.
            int convert(String s)
        2.定义一个测试类(ConverterDemo),在测试类中提供两个方法
            一个方法是： useConverter(Converter c)
            一个方法是主方法，在主方法中调用该useConverter方法
 */
public class ConverterDemo {
    public static void main(String[] args) {
        useConverter((String s) -> {
            return Integer.parseInt(s);
        });
        useConverter(Integer::parseInt);
    }
    private static void useConverter(Converter c){
        int n = c.converter("666");
        System.out.println(n);
    }
}

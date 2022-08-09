package Project.Class.Class3;

public class TryAssertionsDemo {
    public String constructOperation(int l, int r, char op) {
        int value = 0;

        assert 0 <= l && l <= 100 : "左运算数不在0~100的范围.";
        assert 0 <= r && r <= 100 : "右运算数不在0~100的范围.";
        if (op == '+') {
            value = l + r;
            assert 0 <= value && value <= 100 : "加法运算结果不在0~100的范围.";
        } else if (op == '-') {
            value = l - r;
            assert 0 <= value && value <= 100 : "减法运算结果不在0~100的范围.";
        }else{
            assert false : op + "不是加法或减法运算符!";
        }
        return "算式" + l + op + r + "的运算结果是" + value;
    }

    public static void main(String[] args) {
        TryAssertionsDemo ta = new TryAssertionsDemo();
        System.out.println("正常的加法运算:");
        System.out.println(ta.constructOperation(50, 20, '+'));
        System.out.println("正常的减法运算:");        System.out.println(ta.constructOperation(50, 20, '+'));
        System.out.println(ta.constructOperation(50, 20, '-'));
        System.out.println("试验断言:");
        System.out.println(ta.constructOperation(50, 20, '@'));

    }
}

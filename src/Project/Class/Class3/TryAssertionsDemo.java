package Project.Class.Class3;

public class TryAssertionsDemo {
    public String constructOperation(int l, int r, char op) {
        int value = 0;

        assert 0 <= l && l <= 100 : "������������0~100�ķ�Χ.";
        assert 0 <= r && r <= 100 : "������������0~100�ķ�Χ.";
        if (op == '+') {
            value = l + r;
            assert 0 <= value && value <= 100 : "�ӷ�����������0~100�ķ�Χ.";
        } else if (op == '-') {
            value = l - r;
            assert 0 <= value && value <= 100 : "��������������0~100�ķ�Χ.";
        }else{
            assert false : op + "���Ǽӷ�����������!";
        }
        return "��ʽ" + l + op + r + "����������" + value;
    }

    public static void main(String[] args) {
        TryAssertionsDemo ta = new TryAssertionsDemo();
        System.out.println("�����ļӷ�����:");
        System.out.println(ta.constructOperation(50, 20, '+'));
        System.out.println("�����ļ�������:");        System.out.println(ta.constructOperation(50, 20, '+'));
        System.out.println(ta.constructOperation(50, 20, '-'));
        System.out.println("�������:");
        System.out.println(ta.constructOperation(50, 20, '@'));

    }
}

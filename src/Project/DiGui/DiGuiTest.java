package Project.DiGui;

public class DiGuiTest {
    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println(sum);
        int sum1 = Sum(5);
        System.out.println(sum1);
    }
    // 1+2+3+4+5
    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }


    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }else{
            return n + Sum(n - 1);
        }
    }
}

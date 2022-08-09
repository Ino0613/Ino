package Project.Class.Object1;

import java.util.Scanner;

public class Land {
    public static void main(String[] args) {
        Village v1 = new Village();
        Village v2 = new Village();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入村庄1用的水量:");
        v1.setWaterAmount(v1.waterAmount-sc.nextInt());
        int w1 = v1.getWaterAmount();
        System.out.println("村庄1的水量是" + w1);
        int w2 = v2.getWaterAmount();
        System.out.println("村庄2的水量是" + w2);

    }
}

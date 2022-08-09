package Project.Class.Object1;

public class User {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setSpeed(40);
        double s = v1.speed;
        System.out.println("当前速度为" + s);
        v1.speedUp(50);
        v1.speedDown(20);
        v1.setPower(20);
        int p = v1.getPower();
        System.out.println("当前功率为" + p);
    }
}

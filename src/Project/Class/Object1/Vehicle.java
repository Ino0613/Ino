package Project.Class.Object1;

public class Vehicle {
    double speed;
    int power;

    public Vehicle(double speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public Vehicle() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void speedUp(int s){
        this.speed += s;
        System.out.println("该机动车加速了 " + s + ",目前速度为 " + this.speed);
    }

    public void speedDown(int d){
        this.speed -= d;
        System.out.println("该机动车减速了 " + d + ",目前速度为 "+ this.speed);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;

    }
}

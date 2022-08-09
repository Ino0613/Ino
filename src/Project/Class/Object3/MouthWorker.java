package Project.Class.Object3;

public class MouthWorker extends Employee {

    @Override
    public int earnings(int x) {
        //System.out.println("按月领取薪水:" + x * 4);
        return x * 4;
    }

}

package Project.Class.Object3;

public class YearWorker extends Employee {

    @Override
    public int earnings(int x) {
        //System.out.println("按年领取薪水:" + x * 52);
        return x * 52;
    }

}

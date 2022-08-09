package Project.Class.Object3;

public class CompanyTest {
    public static void main(String[] args) {

        Employee[] es = new Employee[30];
        for (int i = 0; i < es.length; i++) {
            if (i % 3 == 0) {
                es[i] = new WeekWorker();
            }
            if (i % 3 == 1) {
                es[i] = new MouthWorker();
            }
            if (i % 3 == 2) {
                es[i] = new YearWorker();
            }


        }
        Company c = new Company(es);
        System.out.println("公司薪水总额：" +c.payMoney() + " 元");
    }
}

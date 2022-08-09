package Project.Class.Object3;

public class Company {
    Employee[] es ;
    int salaries = 0;

    Company(Employee[] es) {
        this.es = es;
    }

    public int  payMoney() {
//        Scanner sc = new Scanner(System.in);
//        int money = sc.nextInt();
        for (Employee e : es) {
            salaries = salaries + e.earnings(100);
        }
        return salaries;
    }

}

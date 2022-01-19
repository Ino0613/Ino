package Project;

public class Account {
    public static void main(String[] args) {

        boolean isFalg = true;
        //用于记录用户的收入和支出详情
        int balance = 10000;

        String details = "收支\t账户金额\t收支金额\t说 明\t \n";


        while(isFalg){

            System.out.println("---------------家庭收支记账软件---------------");
            System.out.println("                 1.收支明细");
            System.out.println("                 2.登记收入");
            System.out.println("                 3.登记支出");
            System.out.println("                 4.退   出\n");
            System.out.print("                  请输入(1-4): ");
            //获取用户的选择: 1-4
            char selection = Utility.readMenuSelection();
            switch(selection){

                case '1':
                    System.out.println("---------------当前收支明细记录---------------");
                    System.out.println(details);
                    System.out.println("-------------------------------------------");
                    break;
                case '2':
                    //System.out.println("2.登记收入");
                    System.out.print("本次收入金额：");
                    int money1 = Utility.readNember();
                    System.out.print("本次收入说明：");
                    String info1 = Utility.readString();
                    //处理balance
                    balance += money1;
                    //获取details
                    details += ("收入\t" + balance + "\t" + money1 + "\t\t" + info1 + "\n");
                    System.out.println("------------------登记完成-------------------\n");

                    break;
                case '3':
                    //System.out.println("3.登记支出");
                    System.out.print("本次支出金额：");
                    int money2 = Utility.readNember();
                    System.out.print("本次支出说明：");
                    String info2 = Utility.readString();
                    //处理balance
                    if(balance >= money2){
                        balance -=money2;
                        //获取details
                        details += ("支出\t" + balance + "\t" + money2 + "\t\t" + info2 + "\n");
                    }else {
                        System.out.println("余额不足！");
                    }

                    System.out.println("------------------登记完成-------------------\n");
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit=='Y'){
                        isFalg = false;
                    }
            }
        }
    }
}

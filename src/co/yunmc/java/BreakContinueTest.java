package co.yunmc.java;

public class BreakContinueTest {
    public static void main(String[] args) {
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=10;j++){
                if(j%4==0){
//                    System.out.println(j);
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();

           }
    }
}

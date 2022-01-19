package co.yunmc.java;

public class PrimeNumberTest {
    public static void main(String[] args) {
        boolean isFlag = true;
        long starts = System.currentTimeMillis();

        for(int i= 2;i<=50000;i++){
            for (int j = 2;j<i;j++){
                if( i % j ==0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println( end - starts);
    }
}

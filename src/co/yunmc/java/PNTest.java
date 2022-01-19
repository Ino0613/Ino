package co.yunmc.java;

public class PNTest {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();

        label:for(int i= 2;i<=50000;i++){
            for (int j = 2;j<Math.sqrt(i);j++){
                if( i % j ==0){
//                    isFlag = false;
//                    break;
                    continue label;
                }
            }
            count++;
            }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count );
        System.out.println("所花费的时间为：" + (end - start));

    }

    }


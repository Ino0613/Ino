package Project.Class.Class4;

import java.util.Scanner;

public class NumberToChinese {
    public NumberToChinese() {

    }

    public String numberToChinese(int n) {
        if (Integer.MAX_VALUE < n || n < 0) {
            throw new RuntimeException(n + "不在32位正整数范围内");
        }

        String infor = "";
        if (n < 10) {
            infor += basicNumber(n);
        } else if (n < 100) {
            infor += tensNumber(n);
        } else if (n < 1000) {
            infor += hunderedNumber(n);
        } else if (n < 10000) {
            infor +=thousandsNumber(n);
            infor = infor.replaceAll("零+", "零");
        } else if (n < 100000000) {
            infor = wansNumber(n);
            infor = clearChineseZeros(infor);
        } else if (n <= Integer.MAX_VALUE) {
            int yis = n / 100000000;
            int rest = n - yis * 100000000;
            if (yis != 0) {
                infor += tensNumber(yis) + "亿";
            }else
                infor += "零";
            if (rest != 0) {
                infor += wansNumber(rest);
            }
            infor = clearChineseZeros(infor);
        }
        return infor;
    }

    private String clearChineseZeros(String infor) {
        //删除重复的零
        infor = infor.replaceAll("零+", "零");
        //去掉头部的零
        if (infor.indexOf("零") == 0) {
            infor = infor.substring(1);
        }
        return infor;
    }

    private String wansNumber(int n) {
        String infor = "";
        int wans = n / 10000;
        int rest = n - wans * 10000;
        if (wans != 0) {
            infor += thousandsNumber(wans) + "万";
        }else
            infor += "零";
        if (rest != 0) {
            infor += thousandsNumber(rest);
        }
        return infor;
    }

    private String thousandsNumber(int n) {
        String infor = "";
        int thousands = n / 1000;
        int rest = n - thousands * 1000;
        if (thousands != 0) {
            infor += basicNumber(thousands) + "仟";
        }else
            infor += "零";
        if (rest != 0) {
            infor += hunderedNumber(rest);
        }
        return infor;
    }

    private String hunderedNumber(int n) {
        String infor = "";
        int hundereds = n / 100;
        int rest = n - hundereds * 100;
        if (hundereds != 0) {
            infor += basicNumber(hundereds) + "佰";
        }else
            infor += "零";
        if (rest != 0) {
            infor += tensNumber(rest);
        }
        return infor;
    }

    private String tensNumber(int n) {
//        if (n == 0) {
//            return "";
//        }
        String infor = "";
        int units = n % 10;
        int tens = n / 10;
        if (tens != 0) {
            infor += basicNumber(tens) + "拾";
        }else
            infor += "零";
        if (units != 0) {
            infor += basicNumber(units);
        }
        return infor;
    }

    private String basicNumber(int n) {
        String infor = "";
        switch (n) {
            case 0:
                infor += "零";
                break;
            case 1:
                infor += "壹";
                break;
            case 2:
                infor += "贰";
                break;
            case 3:
                infor += "叁";
                break;
            case 4:
                infor += "肆";
                break;
            case 5:
                infor += "伍";
                break;
            case 6:
                infor += "陆";
                break;
            case 7:
                infor += "柒";
                break;
            case 8:
                infor += "捌";
                break;
            case 9:
                infor += "玖";
                break;
        }
        return infor;
    }

    public static void main(String[] args) {
        NumberToChinese ntc = new NumberToChinese();
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        System.out.println(i + "    " + ntc.numberToChinese((int) i));
    }
}


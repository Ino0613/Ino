package Project.Class.Class4;

import java.util.Scanner;

public class NumberToChinese {
    public NumberToChinese() {

    }
    //����һ�����в����ķ���
    public String numberToChinese(int n) {
        //�жϸ����Ƿ���32λ��������Χ��
        if (Integer.MAX_VALUE < n || n < 0) {
            throw new RuntimeException(n + "����32λ��������Χ��");
        }
        //�����ж�n�Ĵ�С
        String infor = "";
        if (n < 10) {
            infor += basicNumber(n);
        } else if (n < 100) {
            infor += tensNumber(n);
        } else if (n < 1000) {
            infor += hunderedNumber(n);
        } else if (n < 10000) {
            infor +=thousandsNumber(n);
            infor = infor.replaceAll("��+", "��");
        } else if (n < 100000000) {
            infor = wansNumber(n);
            infor = clearChineseZeros(infor);
        } else if (n <= Integer.MAX_VALUE) {
            int yis = n / 100000000;
            int rest = n - yis * 100000000;
            if (yis != 0) {
                infor += tensNumber(yis) + "��";
            }else
                infor += "��";
            if (rest != 0) {
                infor += wansNumber(rest);
            }
            infor = clearChineseZeros(infor);
        }
        return infor;
    }

    private String clearChineseZeros(String infor) {
        //ɾ���ظ�����
        infor = infor.replaceAll("��+", "��");
        //ȥ��ͷ������
        if (infor.indexOf("��") == 0) {
            infor = infor.substring(1);
        }
        return infor;
    }

    private String wansNumber(int n) {
        String infor = "";
        int wans = n / 10000;
        int rest = n - wans * 10000;
        if (wans != 0) {
            infor += thousandsNumber(wans) + "��";
        }else
            infor += "��";
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
            infor += basicNumber(thousands) + "Ǫ";
        }else
            infor += "��";
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
            infor += basicNumber(hundereds) + "��";
        }else
            infor += "��";
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
            infor += basicNumber(tens) + "ʰ";
        }else
            infor += "��";
        if (units != 0) {
            infor += basicNumber(units);
        }
        return infor;
    }

    private String basicNumber(int n) {
        String infor = "";
        switch (n) {
            case 0:
                infor += "��";
                break;
            case 1:
                infor += "Ҽ";
                break;
            case 2:
                infor += "��";
                break;
            case 3:
                infor += "��";
                break;
            case 4:
                infor += "��";
                break;
            case 5:
                infor += "��";
                break;
            case 6:
                infor += "½";
                break;
            case 7:
                infor += "��";
                break;
            case 8:
                infor += "��";
                break;
            case 9:
                infor += "��";
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


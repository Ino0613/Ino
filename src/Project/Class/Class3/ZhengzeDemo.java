package Project.Class.Class3;

public class ZhengzeDemo {

    public static void idTester(){
        //���Ա�ʶ���Ļ�������
        String[] testCases = {"A", "z26", "name", "student2", "2score","student_", "student_2"};
        boolean right;
        for (String str : testCases) {
            right = str.matches("[a-zA-Z0-9_]*$");
            if (right) {
                System.out.println(str + "��һ����ʶ��");
            }else
                System.out.println(str + "����һ����ʶ��!");
        }
    }

    public static void main(String[] args) {
        idTester();
    }
}

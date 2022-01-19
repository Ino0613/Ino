package co.yunmc.OOP.Test;

/*4.
    对象数组题目:
    定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩
    score(int)。创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
    问题一:打印出3年级(state值为3）的学生信息。
    问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
    提示:
      1)生成随机数:Math.random()，返回值类型double;
      2)四舍五入取整:Math.round(double d)，返回值类型long。


 */
public class ArrayTest {
    public static void main(String[] args) {
        //声明一个Student类型的数组
        Student[] stud = new Student[20];
        for (int i = 0; i < stud.length; i++) {
            //给数组元素赋值
            stud[i] = new Student();
            //给Student对象属性赋值
            stud[i].number = i+1;
            //年级，[1,6]
            stud[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //成绩,[0,100]
            stud[i].score = (int) (Math.random() * (100 - 0 + 1));
        }
        //遍历数组
        /*for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].number + stud[i].state + stud[i].score);
        }*/
        for (int i = 0; i < stud.length; i++) {
        System.out.println(stud[i].info());
        }

        //问题一：
        for (int i = 0; i < stud.length; i++) {
            if (stud[i].state == 3) {
                System.out.println(stud[i].info());
            }
        }
        //问题二：

    }
}

class Student {
    int number;
    int state;
    int score;
    int[] Student = new int[20];

    //显示学生信息的方法
    public String info(){
        return "学号:" + number + "年级：" + state + "成绩：" + score;
    }

}

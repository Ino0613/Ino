package Project.Consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] name = {"林青霞,43", "张曼玉,33", "王祖贤,22"};
        Consumer1(name, (String str) -> {
            String name1 = str.split(",")[0];
            System.out.print("姓名" + name1);
        }, (String str) -> {
            int age = Integer.parseInt(str.split(",")[1]);
            System.out.println(",年龄" + age);
        });
    }

    public static void Consumer1(String[] name, Consumer<String> con1, Consumer<String> con2) {
        for (String str : name) {
            con1.andThen(con2).accept(str);
        }
    }
}

package co.yunmc.Shixun1.One;

import java.io.Serializable;

public class Students implements Serializable {
    private int id;
    private String name;
    private int age;

    public Students(){
        super();
    }

    public Students(int i, String 张三, int i1) {
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package Project.FileStream.Test;

public class Student {

    @Override
    public String toString() {
        return name + ',' + num + ',' + age + ',' +
                address ;
    }

    public Student(String name, String num, int age, String address) {
        this.name = name;
        this.num = num;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    String name;
    String num;
    int age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

package Project.Class.Object3.Four;

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("狗叫");
    }

    @Override
    public String getAnimalName() {
        String name = "狗";
        System.out.println("该动物名是：" + name);
        return name;
    }
}

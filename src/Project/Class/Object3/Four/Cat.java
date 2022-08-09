package Project.Class.Object3.Four;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("猫叫");
    }

    @Override
    public String getAnimalName() {
        String name = "猫";
        System.out.println("该动物名是：" + name);
        return name;
    }
}

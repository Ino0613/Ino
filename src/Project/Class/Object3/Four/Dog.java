package Project.Class.Object3.Four;

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("����");
    }

    @Override
    public String getAnimalName() {
        String name = "��";
        System.out.println("�ö������ǣ�" + name);
        return name;
    }
}

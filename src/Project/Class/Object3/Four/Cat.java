package Project.Class.Object3.Four;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("è��");
    }

    @Override
    public String getAnimalName() {
        String name = "è";
        System.out.println("�ö������ǣ�" + name);
        return name;
    }
}

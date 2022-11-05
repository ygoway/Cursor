package HomeWork3;

public abstract class Plant extends Forest implements Nameable, Ageable {

    private final String name;
    private int age;
    public static int countOfTrees = 0;
    public static int countOfBushes = 0;

    public Plant(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void plantInfo();


}

package HomeWork3;

public class Bush extends Plant {

    public Bush(String name) {
        super(name);
        countOfBushes++;
    }

    public static void numberOf() {
        System.out.println("Number of bushes " + countOfBushes);
    }

    @Override
    public void plantInfo() {
        System.out.println(getName() + " has been growing for " + getAge() + " years");
    }
}

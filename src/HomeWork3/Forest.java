package HomeWork3;

public class Forest implements Nameable {

    private final String name;
    private int age;
    public static final int AGE_OF_GRASS = 1;

    public Forest(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int cyclesOfGrass() {
        return age / AGE_OF_GRASS;
    }

    public static void numberOf() {
    }

    public void act(String name) {
        System.out.println(name + " photosynthesis");
    }

}


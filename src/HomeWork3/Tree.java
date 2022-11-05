package HomeWork3;

public class Tree extends Plant {

    public Tree(String name) {
        super(name);
        countOfTrees++;
    }

    public static void numberOf() {
        System.out.println("Number of trees " + countOfTrees);
    }

    @Override
    public void plantInfo() {
        System.out.println(getName() + " has been growing for " + getAge() + " years");
    }

}


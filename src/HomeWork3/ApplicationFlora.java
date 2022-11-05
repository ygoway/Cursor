package HomeWork3;

public class ApplicationFlora {

    public static void main(String[] args) {

        Forest forest = new Forest("UkrainianForest");
        forest.setAge(300);

        Tree tree = new Tree("Verba");
        tree.setAge(70);
        Tree tree1 = new Tree("Topolya");
        tree1.setAge(34);
        Tree tree2 = new Tree("Bereza");
        tree2.setAge(54);

        Bush bush = new Bush("Kaluna");
        bush.setAge(22);

        Grass grass = new Grass("Grass", "Green");

        forest.act(tree2.getName());
        forest.act(grass.getName());

        Forest.numberOf();
        Tree.numberOf();

        tree1.plantInfo();

        System.out.println("There were " + forest.cyclesOfGrass() + " grass cycles in forest");

    }
}

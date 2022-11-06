package HomeWork4;

public class MyListRunner {

    public static void main(String[] args) {

        MyList<Integer> nums = new MyList<>();

        nums.add(908);
        nums.add(743);
        nums.add(231);
        nums.add(711243);
        nums.add(-2483);

        System.out.println("Smallest number of list " + nums.smallest());
        System.out.println("Largest number of list " + nums.largest());
    }

}

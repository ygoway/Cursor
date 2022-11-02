package HomeWork2;

public class Average {
    public static void main(String[] args) {

        int[] array = {1, 7, 10, -10};
        double sum = 0;

        for (int i : array) {
            sum += i;
        }
        double avg = sum / array.length;
        System.out.println(avg);
    }
}

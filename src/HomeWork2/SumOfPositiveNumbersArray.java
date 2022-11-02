package HomeWork2;

public class SumOfPositiveNumbersArray {
    public static void main(String[] args) {

        int[] nums = {4, 10, -23, 6, -5, 1};
        int sum = 0;
        for (int i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
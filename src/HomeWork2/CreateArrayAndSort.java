package HomeWork2;

import java.util.Arrays;
import java.util.Collections;

public class CreateArrayAndSort {

    public static void main(String[] args) {

        Integer [] nums = {2, 3, 1, 7, 11};
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.printf("Array sorted in ReverseOrder : %s",
                Arrays.toString(nums));
    }
}

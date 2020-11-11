package SortAlgorithm.Bai_tap;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 8, 4, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}

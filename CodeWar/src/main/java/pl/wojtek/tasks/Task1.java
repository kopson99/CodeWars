package pl.wojtek.tasks;

import java.util.Arrays;

public class Task1 {
    public static int[] sortArray(int[] array) {

        final int[] sortedArray = Arrays.stream(array).filter(value -> value % 2 != 0).sorted().toArray();
        final int[] sorted = new int[array.length];
        int indexOfSortedNumber = 0;
        for (int i =0; i<array.length; i++) {
            final int number = array[i];
            if (number % 2 ==0) {
                sorted[i] = number;
            }
            else {
                sorted[i] = sortedArray[indexOfSortedNumber];
                indexOfSortedNumber++;
            }
        }

        return sorted;
    }
}

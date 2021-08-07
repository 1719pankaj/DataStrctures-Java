package DataStructures.CollectionsFramework.ArraysAndCollections;

import java.util.Arrays;

public class LArraysClass {
    public static void main(String[] ocon) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of element 4 in the array is " + index);

        //Fill a number all through the array
        Arrays.fill(numbers, 12);

        Arrays.sort(numbers);
        for(int i: numbers) {
            System.out.println(i + " ");
        }

    }
}

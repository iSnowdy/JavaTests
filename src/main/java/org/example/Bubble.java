package org.example;

import java.util.Arrays;

public class Bubble {
    public static String BubbleMethod(int[] array) {

        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return Arrays.toString(array);
    }

    public static void main(String[] args) {

        int[] array = {4, 3, 5, 2, 1};

        System.out.println(BubbleMethod(array));

    }
}
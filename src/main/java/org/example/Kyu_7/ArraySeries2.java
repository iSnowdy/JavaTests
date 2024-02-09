package org.example.Kyu_7;
import java.util.Arrays;

public class ArraySeries2 {
    public static long maxProduct(int[] numbers, int sub_size) {
        for (int i = 0; i < (numbers.length - 1); i ++) {
            for (int j = 0; j < (numbers.length - i - 1); j ++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

        long result = 1;
        int n;

        for (int i = 0; i < sub_size; i ++) {
            n = numbers[numbers.length - 1 - i];
            System.out.println(n);
            result = n*result;
            System.out.println("Result is: " + result);
        }

        return result;
    }
}

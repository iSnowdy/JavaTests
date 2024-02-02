package org.example.Kyu_6;

public class transform_to_Prime {
    public static int minimumNumber(int[] numbers) {

        int size = 0;
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            size = size + numbers[i];
        }

        int ogSize = size;

        System.out.println("Size is: " + size);


        for(int i = 2; i < size; i++) {
            if (size % i == 0) {
                size ++;
                i = 2;
            }
        }

        System.out.println(size);

        result = size - ogSize;

        System.out.println(result);

        return result; // Do your magic!
    }
}
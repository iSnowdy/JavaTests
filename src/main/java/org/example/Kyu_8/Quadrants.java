package org.example.Kyu_8;

public class Quadrants {
    public static void main (String[] args) {

        int x = -10;
        int y = 100;

        int result;

        if (x > 0 && y > 0) {
            result = 1;
        } else if (x < 0 && y > 0) {
            result = 2;
        } else if (x < 0 && y < 0) {
            result = 3;
        } else {
            result = 4;
        }

        System.out.println(result);

    }

}

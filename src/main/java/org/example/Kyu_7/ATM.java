package org.example.Kyu_7;

public class ATM {

    public int solve(int n) {

        Integer[] bills = {500, 200, 100, 50, 20, 10};
        Integer counter = 0;

        if (n > 1500 || n % 10 != 0) {
            return -1;
        }
        else {
            for (int i : bills) {
                while (n >= i) {
                    n -= i;
                    counter++;
                }
            }

            return counter;
        }
    }

}
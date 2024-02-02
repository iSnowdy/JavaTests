package org.example.Kyu_8;

public class Even_Odd {
    public static String evenOrOdd(int number) {

        String result;

        result =  (number % 2) == 0 ? "Even" : "Odd"; // Question that if its "Yes" returns the first print. Otherwise the second one ( ... : ...)

        System.out.println(result);

        return result;
    }
}

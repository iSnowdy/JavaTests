package org.example.Kyu_8;

public class Reserved_Strings {
    public static void main (String[] args) {

        String str = "world";
        String reversedString = "";

        for (int i = 0; i < str.length(); i++) {
            reversedString = str.charAt(i) + reversedString;
        }

        System.out.println(reversedString);
    }
}

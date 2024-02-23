package org.example.Kyu_6;

public class EncryptThis {
    public static String encryptThis(String text) {

        System.out.println(text);

        if (text.length() == 0) {
            return "";
        }

        String result = "";
        String[] textArray;
        textArray = text.split(" ");

        for (String word : textArray) {
            String reversedWord = "";
            int numberASCII = word.getBytes()[0];
            for (int i = 1; i < word.length(); i ++) {
                String temp = String.valueOf(word.charAt(i));

            }
            result = result + numberASCII + reversedWord + " ";
        }

        System.out.println(result);
        return result.strip();

    }
}
package org.example.Kyu_6;

public class BasicEncryption {

    public String encrypt(String text, int rule) {

        String result = "";

        for (int i = 0; i < text.length(); i ++) {
            char character = text.toCharArray()[i];
            int numberASCII = text.getBytes()[i];

            numberASCII = numberASCII + rule;

            numberASCII = numberASCII > 255 ? numberASCII = ((numberASCII - 256) & 0xFF) : numberASCII;

            char convertedCharacter = (char) numberASCII;
            result = result + convertedCharacter;
        }

        return result;

    }
}
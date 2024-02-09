package org.example.Kyu_6;

import java.util.Arrays;

public class EmotionalSort {

    public static String[] sortEmotions(boolean order,String[] emotions) {
        // (ง •̀_•́)ง

        System.out.println(Arrays.toString(emotions));

        String[] happyFaces = {":D", ":)", ":|", ":(", "T_T"};
        String[] sadFaces = {"T_T", ":(", ":|", ":)", ":D"};
        String orderedFaces = "";

        if (order) {
            for (int i = 0; i < emotions.length - 1; i ++) {
                for (int j = 0; j < emotions.length - i - 1; j ++) {
                    if (emotions[j] == happyFaces[j]) {
                        String temp = emotions[j];
                        emotions[j] = emotions[j + 1];
                        emotions[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Ordered result: " + Arrays.toString(emotions));

        return new String[0];
    }

}
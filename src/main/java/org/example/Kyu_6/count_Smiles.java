package org.example.Kyu_6;

import java.util.List;

public class count_Smiles {

    public static int countSmileys(List<String> arr) {

        String[] eyes = {":", ";"};
        String[] nose = {"-", "~", ""};
        String[] mouth = {")", "D"};

        int result = 0;

        for (int i = 0; i < arr.size(); i++) {
            // System.out.println(arr.get(i));
            if (arr.get(i).length() >= 2 && (arr.get(i).contains(eyes[0]) || arr.get(i).contains(eyes[1]))) {
                if (arr.get(i).length() == 2 || (arr.get(i).length() == 3 && isValidNose(arr.get(i).charAt(1), nose))) {
                    if (arr.get(i).charAt(arr.get(i).length() - 1) == ')' || arr.get(i).charAt(arr.get(i).length() - 1) == 'D') {
                        result++;
                    }
                }
            }
        }

    /*

    arr.get.length >= 2 is due to the fact that a face must have at least a pair of eyes and a mouth. This will also
    handle cases where that is not the case and therefore goes out of index

    arr.get.length for the nose is done so we can first do the cases where it has no nose (2) and then the cases where it has a nose
    and also validate that nose with the method

    */

        return result;

    }

    private static boolean isValidNose(char noseChar, String[] nose) {

        String noseString = String.valueOf(noseChar);
        return noseString.equals(nose[0]) || noseString.equals(nose[1]) || noseString.equals(nose[2]);
    }
}
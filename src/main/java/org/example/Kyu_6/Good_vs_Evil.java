/*

package org.example.Kyu_6;

public class Good_vs_Evil {
    public static String battle(String goodAmounts, String evilAmounts) {

        int[] goodForces = {1, 2, 3, 3, 4, 10};
        int[] evilForces = {1, 2, 2, 2, 3, 5 ,10};
        String result = "";

        System.out.println(goodAmounts.getClass());
        System.out.println(goodAmounts.charAt(3));

        String[] goodSplit = goodAmounts.split(" ");
        String[] evilSplit = evilAmounts.split(" ");

        System.out.println(goodSplit);

        int goodCount = Frodo(goodAmounts.split(" "), goodForces);
        int evilCount = Frodo(evilAmounts.split(" "), evilForces);

        if (goodCount > evilCount) {
            return "Battle Result: Good triumphs over Evil";
        }

        else if (evilCount > goodCount) {
            return "Battle Result: Evil eradicates all trace of Good";
        }

        else {
            return "Battle Result: No victor on this battle field"
        }



        private static int Frodo(String[] count, int[] worth) {
            int value = 0;
            for (int i = 0; i < count.length; i ++) {
                value = value + (Integer.parseInt(count[i]) * worth);
            }

            return value;







    }
}

*/


package org.example.Kyu_6;
import java.util.*;


public class test {
    public static void main (String[] args) {

        String goodAmounts = "1 1 1 1 1 1";
        String evilAmounts = "1 1 1 1 1 1 1";

        int[] goodForces = {1, 2, 3, 3, 4, 10};
        int[] evilForces = {1, 2, 2, 2, 3, 5 ,10};
        String result = "";

        System.out.println(goodAmounts.getClass());
        System.out.println(goodAmounts.charAt(3));

        String[] goodSplit = goodAmounts.split(" ");
        String[] evilSplit = evilAmounts.split(" ");

        System.out.println(goodSplit);


        }
}

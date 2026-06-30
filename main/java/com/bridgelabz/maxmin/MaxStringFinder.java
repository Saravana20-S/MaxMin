package com.bridgelabz.maxmin;

public class MaxStringFinder {

    /**
     * UC 3: Finds the maximum of three Strings using the compareTo method.
     */
    public static String findMax(String first, String second, String third) {
        String max = first; // Assume first is the largest initially

        if (second.compareTo(max) > 0) {
            max = second; // second is larger
        }
        if (third.compareTo(max) > 0) {
            max = third; // third is larger
        }

        return max;
    }
}
package com.bridgelabz.maxmin;

public class GenericMaximumFinder {

    /**
     * Refactor 1: A single generic method to find the maximum of three comparable objects.
     */
    public static <T extends Comparable<T>> T findMax(T first, T second, T third) {
        T max = first; // Assume first is the largest initially

        if (second.compareTo(max) > 0) {
            max = second; // second is larger
        }
        if (third.compareTo(max) > 0) {
            max = third; // third is larger
        }

        return max;
    }
}
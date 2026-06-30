package com.bridgelabz.maxmin;
public class MaxIntegerFinder {

    /**
     * UC 1: Finds the maximum of three Integers using the compareTo method.
     */
    public static Integer findMax(Integer first, Integer second, Integer third) {
        Integer max = first;

        if (second.compareTo(max) > 0) {
            max = second;
        }
        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }
}
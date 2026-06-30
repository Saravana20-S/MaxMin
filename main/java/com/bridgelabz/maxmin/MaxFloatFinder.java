package com.bridgelabz.maxmin;

public class MaxFloatFinder {

    /**
     * UC 2: Finds the maximum of three Floats using the compareTo method.
     */
    public static Float findMax(Float first, Float second, Float third) {
        Float max = first;

        if (second.compareTo(max) > 0) {
            max = second;
        }
        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }
}
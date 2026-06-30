package com.bridgelabz.maxmin;

import java.util.Arrays;

public class PrintParamMaximumFinder<T extends Comparable<T>> {

    private T[] values;

    @SafeVarargs
    public PrintParamMaximumFinder(T... values) {
        this.values = values;
    }

    /**
     * Instance method that invokes the static logic.
     */
    public T testMaximum() {
        return PrintParamMaximumFinder.testMaximum(this.values);
    }

    /**
     * Core static generic method that sorts the elements, prints the max, and returns it.
     */
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        // 1. Sort the elements
        Arrays.sort(values);

        // 2. Identify the maximum value
        T max = values[values.length - 1];

        // 3. UC 5: Internally call the generic printMax method
        PrintParamMaximumFinder.printMax(max);

        return max;
    }

    /**
     * UC 5: Generic method to print the maximum value to standard out.
     */
    public static <T> void printMax(T max) {
        System.out.println("Maximum Value: " + max);
    }
}
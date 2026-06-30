package com.bridgelabz.maxmin;

import java.util.Arrays;

public class MultiParamMaximumFinder<T extends Comparable<T>> {

    private T[] values;

    // Varargs constructor to dynamically accept any number of arguments
    @SafeVarargs
    public MultiParamMaximumFinder(T... values) {
        this.values = values;
    }

    /**
     * Instance method that invokes the static sorting logic.
     */
    public T testMaximum() {
        return MultiParamMaximumFinder.testMaximum(this.values);
    }

    /**
     * Static generic method that sorts the elements to find the absolute maximum.
     */
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        // Sorts array into ascending order
        Arrays.sort(values);

        // Returns the final (largest) element in the sorted sequence
        return values[values.length - 1];
    }
}
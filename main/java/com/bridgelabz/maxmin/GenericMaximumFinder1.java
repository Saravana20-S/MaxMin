package com.bridgelabz.maxmin;

// The entire class is now generic and type-bounded
public class GenericMaximumFinder1<T extends Comparable<T>> {

    // Instance variables
    private T first;
    private T second;
    private T third;

    // Parameterized constructor
    public GenericMaximumFinder1(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Instance method that internally calls the static testMaximum method
     * passing the 3 instance variables.
     */
    public T testMaximum() {
        return GenericMaximumFinder1.testMaximum(this.first, this.second, this.third);
    }

    /**
     * Core static generic method to find the maximum of three comparable objects.
     */
    public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {
        T max = first;

        if (second.compareTo(max) > 0) {
            max = second;
        }
        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }
}
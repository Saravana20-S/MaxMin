package com.bridgelabz.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiParamMaximumFinderTest {

    @Test
    public void givenMultipleIntegers_ShouldReturnMaximumUsingSorting() {
        // Testing with 5 integers -> Max is 120
        MultiParamMaximumFinder<Integer> finder = new MultiParamMaximumFinder<>(45, 90, 120, 30, 75);
        assertEquals(Integer.valueOf(120), finder.testMaximum());
    }

    @Test
    public void givenMultipleFloats_ShouldReturnMaximumUsingSorting() {
        // Testing with 4 floats -> Max is 105.6f
        MultiParamMaximumFinder<Float> finder = new MultiParamMaximumFinder<>(12.3f, 88.4f, 105.6f, 45.1f);
        assertEquals(Float.valueOf(105.6f), finder.testMaximum());
    }

    @Test
    public void givenMultipleStrings_ShouldReturnMaximumUsingSorting() {
        // Testing with 4 strings -> Max is "Watermelon" lexicographically
        MultiParamMaximumFinder<String> finder = new MultiParamMaximumFinder<>("Peach", "Banana", "Apple", "Watermelon");
        assertEquals("Watermelon", finder.testMaximum());
    }
}
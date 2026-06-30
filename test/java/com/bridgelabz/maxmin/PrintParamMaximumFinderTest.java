package com.bridgelabz.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintParamMaximumFinderTest {

    @Test
    public void givenMultipleIntegers_ShouldPrintAndReturnMaximum() {
        PrintParamMaximumFinder<Integer> finder = new PrintParamMaximumFinder<>(45, 90, 120, 30, 75);
        // This will print "Maximum Value: 120" to your console
        assertEquals(Integer.valueOf(120), finder.testMaximum());
    }

    @Test
    public void givenMultipleFloats_ShouldPrintAndReturnMaximum() {
        PrintParamMaximumFinder<Float> finder = new PrintParamMaximumFinder<>(12.3f, 88.4f, 105.6f, 45.1f);
        // This will print "Maximum Value: 105.6" to your console
        assertEquals(Float.valueOf(105.6f), finder.testMaximum());
    }

    @Test
    public void givenMultipleStrings_ShouldPrintAndReturnMaximum() {
        PrintParamMaximumFinder<String> finder = new PrintParamMaximumFinder<>("Peach", "Banana", "Apple", "Watermelon");
        // This will print "Maximum Value: Watermelon" to your console
        assertEquals("Watermelon", finder.testMaximum());
    }
}
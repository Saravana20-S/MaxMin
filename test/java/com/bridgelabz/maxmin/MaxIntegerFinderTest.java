package com.bridgelabz.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIntegerFinderTest {

    // TC 1.1: Given Max Number at 1st Position return the Same Number
    @Test
    public void givenMaxIntegerAtFirstPosition_ShouldReturnSameNumber() {
        Integer result = MaxIntegerFinder.findMax(90, 45, 30);
        assertEquals(Integer.valueOf(90), result, "Failed: Max integer should be at 1st position.");
    }

    // TC 1.2: Given Max Number at 2nd Position return the Same Number
    @Test
    public void givenMaxIntegerAtSecondPosition_ShouldReturnSameNumber() {
        Integer result = MaxIntegerFinder.findMax(45, 90, 30);
        assertEquals(Integer.valueOf(90), result, "Failed: Max integer should be at 2nd position.");
    }

    // TC 1.3: Given Max Number at 3rd Position return the Same Number
    @Test
    public void givenMaxIntegerAtThirdPosition_ShouldReturnSameNumber() {
        Integer result = MaxIntegerFinder.findMax(45, 30, 90);
        assertEquals(Integer.valueOf(90), result, "Failed: Max integer should be at 3rd position.");
    }
}
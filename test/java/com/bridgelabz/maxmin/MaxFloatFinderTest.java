package com.bridgelabz.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxFloatFinderTest {

    // TC 2.1: Given Max Float at 1st Position return the Same Number
    @Test
    public void givenMaxFloatAtFirstPosition_ShouldReturnSameNumber() {
        Float result = MaxFloatFinder.findMax(90.5f, 45.3f, 30.2f);
        assertEquals(Float.valueOf(90.5f), result, "Failed: Max float should be at 1st position.");
    }

    // TC 2.2: Given Max Float at 2nd Position return the Same Number
    @Test
    public void givenMaxFloatAtSecondPosition_ShouldReturnSameNumber() {
        Float result = MaxFloatFinder.findMax(45.3f, 90.5f, 30.2f);
        assertEquals(Float.valueOf(90.5f), result, "Failed: Max float should be at 2nd position.");
    }

    // TC 2.3: Given Max Float at 3rd Position return the Same Number
    @Test
    public void givenMaxFloatAtThirdPosition_ShouldReturnSameNumber() {
        Float result = MaxFloatFinder.findMax(45.3f, 30.2f, 90.5f);
        assertEquals(Float.valueOf(90.5f), result, "Failed: Max float should be at 3rd position.");
    }
}
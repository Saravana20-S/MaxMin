package com.bridgelabz.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxStringFinderTest {

    // TC 3.1: Given Max String at 1st Position return the Same String
    @Test
    public void givenMaxStringAtFirstPosition_ShouldReturnSameString() {
        String result = MaxStringFinder.findMax("Peach", "Banana", "Apple");
        assertEquals("Peach", result, "Failed: Max string should be at 1st position.");
    }

    // TC 3.2: Given Max String at 2nd Position return the Same String
    @Test
    public void givenMaxStringAtSecondPosition_ShouldReturnSameString() {
        String result = MaxStringFinder.findMax("Banana", "Peach", "Apple");
        assertEquals("Peach", result, "Failed: Max string should be at 2nd position.");
    }

    // TC 3.3: Given Max String at 3rd Position return the Same String
    @Test
    public void givenMaxStringAtThirdPosition_ShouldReturnSameString() {
        String result = MaxStringFinder.findMax("Banana", "Apple", "Peach");
        assertEquals("Peach", result, "Failed: Max string should be at 3rd position.");
    }
}
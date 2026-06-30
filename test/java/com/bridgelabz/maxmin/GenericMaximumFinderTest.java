package com.bridgelabz.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMaximumFinderTest {

    // ================== TC 1: INTEGER TESTS ==================

    @Test
    public void givenMaxIntegerAtFirstPosition_ShouldReturnSameNumber() {
        Integer result = GenericMaximumFinder.findMax(90, 45, 30);
        assertEquals(Integer.valueOf(90), result);
    }

    @Test
    public void givenMaxIntegerAtSecondPosition_ShouldReturnSameNumber() {
        Integer result = GenericMaximumFinder.findMax(45, 90, 30);
        assertEquals(Integer.valueOf(90), result);
    }

    @Test
    public void givenMaxIntegerAtThirdPosition_ShouldReturnSameNumber() {
        Integer result = GenericMaximumFinder.findMax(45, 30, 90);
        assertEquals(Integer.valueOf(90), result);
    }

    // ================== TC 2: FLOAT TESTS ==================

    @Test
    public void givenMaxFloatAtFirstPosition_ShouldReturnSameNumber() {
        Float result = GenericMaximumFinder.findMax(90.5f, 45.3f, 30.2f);
        assertEquals(Float.valueOf(90.5f), result);
    }

    @Test
    public void givenMaxFloatAtSecondPosition_ShouldReturnSameNumber() {
        Float result = GenericMaximumFinder.findMax(45.3f, 90.5f, 30.2f);
        assertEquals(Float.valueOf(90.5f), result);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_ShouldReturnSameNumber() {
        Float result = GenericMaximumFinder.findMax(45.3f, 30.2f, 90.5f);
        assertEquals(Float.valueOf(90.5f), result);
    }

    // ================== TC 3: STRING TESTS ==================

    @Test
    public void givenMaxStringAtFirstPosition_ShouldReturnSameString() {
        String result = GenericMaximumFinder.findMax("Peach", "Banana", "Apple");
        assertEquals("Peach", result);
    }

    @Test
    public void givenMaxStringAtSecondPosition_ShouldReturnSameString() {
        String result = GenericMaximumFinder.findMax("Banana", "Peach", "Apple");
        assertEquals("Peach", result);
    }

    @Test
    public void givenMaxStringAtThirdPosition_ShouldReturnSameString() {
        String result = GenericMaximumFinder.findMax("Banana", "Apple", "Peach");
        assertEquals("Peach", result);
    }
}
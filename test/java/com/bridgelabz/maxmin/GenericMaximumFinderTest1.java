package com.bridgelabz.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMaximumFinderTest1 {

    // ================== TC 1: INTEGER TESTS (Using Generic Class) ==================

    @Test
    public void givenMaxIntegerAtFirstPosition_ShouldReturnSameNumber() {
        GenericMaximumFinder1<Integer> finder = new GenericMaximumFinder1<>(90, 45, 30);
        assertEquals(Integer.valueOf(90), finder.testMaximum());
    }

    @Test
    public void givenMaxIntegerAtSecondPosition_ShouldReturnSameNumber() {
        GenericMaximumFinder1<Integer> finder = new GenericMaximumFinder1<>(45, 90, 30);
        assertEquals(Integer.valueOf(90), finder.testMaximum());
    }

    @Test
    public void givenMaxIntegerAtThirdPosition_ShouldReturnSameNumber() {
        GenericMaximumFinder1<Integer> finder = new GenericMaximumFinder1<>(45, 30, 90);
        assertEquals(Integer.valueOf(90), finder.testMaximum());
    }

    // ================== TC 2: FLOAT TESTS (Using Generic Class) ==================

    @Test
    public void givenMaxFloatAtFirstPosition_ShouldReturnSameNumber() {
        GenericMaximumFinder1<Float> finder = new GenericMaximumFinder1<>(90.5f, 45.3f, 30.2f);
        assertEquals(Float.valueOf(90.5f), finder.testMaximum());
    }

    @Test
    public void givenMaxFloatAtSecondPosition_ShouldReturnSameNumber() {
        GenericMaximumFinder1<Float> finder = new GenericMaximumFinder1<>(45.3f, 90.5f, 30.2f);
        assertEquals(Float.valueOf(90.5f), finder.testMaximum());
    }

    @Test
    public void givenMaxFloatAtThirdPosition_ShouldReturnSameNumber() {
        GenericMaximumFinder1<Float> finder = new GenericMaximumFinder1<>(45.3f, 30.2f, 90.5f);
        assertEquals(Float.valueOf(90.5f), finder.testMaximum());
    }

    // ================== TC 3: STRING TESTS (Using Generic Class) ==================

    @Test
    public void givenMaxStringAtFirstPosition_ShouldReturnSameString() {
        GenericMaximumFinder1<String> finder = new GenericMaximumFinder1<>("Peach", "Banana", "Apple");
        assertEquals("Peach", finder.testMaximum());
    }

    @Test
    public void givenMaxStringAtSecondPosition_ShouldReturnSameString() {
        GenericMaximumFinder1<String> finder = new GenericMaximumFinder1<>("Banana", "Peach", "Apple");
        assertEquals("Peach", finder.testMaximum());
    }

    @Test
    public void givenMaxStringAtThirdPosition_ShouldReturnSameString() {
        GenericMaximumFinder1<String> finder = new GenericMaximumFinder1<>("Banana", "Apple", "Peach");
        assertEquals("Peach", finder.testMaximum());
    }
}
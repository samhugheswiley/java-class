package com.tsg.unittesting;

import static com.tsg.unittesting.arrays.ArrayExerciseB.multiplyAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayExerciseBTest {

    /*  Test Plan:
    **  multiplyAll( 5 , [ 1 , 2 , 3 , 4 , 5 ] ) ->  [ 5 , 10 , 15 , 20 , 25 ]
    **  multiplyAll( 0 , [ 1 , 1 , 1 , 1 , 1  , 1 , 1 , 1 , 1 ] ) ->  [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ]
    **  multiplyAll( -1 , [ -2 , 0 , 0 , 1 ] ) ->  [ 2 , 0 , 0 , -1 ]
    **  multiplyAll( 0 , [ -1 , -6 , -8 , 4 , 7 ] ) ->  [ 0 , 0 , 0 , 0 , 0 ]
    **  multiplyAll( 2 , [ 0 , -2 , 6 , -4 , 1 ] ) ->  [ 0 , -4 , 12 , -8 , 2 ]
    **  multiplyAll( -2 , [ 1 , 2 , 0 , 0 , 5 ] ) ->  [ -2 , -4 , 0 , 0 , -10 ]
     */

    @Test
    public void testOne() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int multiplier = 5;
        int[] numbers = { 1 , 2 , 3 , 4 , 5 };

        // ACT
        int[] multiplied = multiplyAll(multiplier, numbers);

        // ASSERT - w/ Message
        int[] expectedMultiplied = { 5 , 10 , 15 , 20 , 25 };
        assertEquals(expectedMultiplied, multiplied, "Expected { 5 , 10 , 15 , 20 , 25 }");
    }

    @Test
    public void testTwo() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int multiplier = 0;
        int[] numbers = { 1 , 1 , 1 , 1 , 1  , 1 , 1 , 1 , 1 };

        // ACT
        int[] multiplied = multiplyAll(multiplier, numbers);

        // ASSERT - w/ Message
        int[] expectedMultiplied = { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };
        assertEquals(expectedMultiplied, multiplied, "Expected { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }");
    }

    @Test
    public void testThree() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int multiplier = -1;
        int[] numbers = { -2 , 0 , 0 , 1 };

        // ACT
        int[] multiplied = multiplyAll(multiplier, numbers);

        // ASSERT - w/ Message
        int[] expectedMultiplied = { 2 , 0 , 0 , -1 };
        assertEquals(expectedMultiplied, multiplied, "Expected { 2 , 0 , 0 , -1 }");
    }

    @Test
    public void testFour() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int multiplier = 0;
        int[] numbers = { -1 , -6 , -8 , 4 , 7 };

        // ACT
        int[] multiplied = multiplyAll(multiplier, numbers);

        // ASSERT - w/ Message
        int[] expectedMultiplied = { 0 , 0 , 0 , 0 , 0 };
        assertEquals(expectedMultiplied, multiplied, "Expected { 0 , 0 , 0 , 0 , 0 }");
    }

    @Test
    public void testFive() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int multiplier = 2;
        int[] numbers = { 0 , -2 , 6 , -4 , 1 };

        // ACT
        int[] multiplied = multiplyAll(multiplier, numbers);

        // ASSERT - w/ Message
        int[] expectedMultiplied = { 0 , -4 , 12 , -8 , 2 };
        assertEquals(expectedMultiplied, multiplied, "Expected { 0 , -4 , 12 , -8 , 2 }");
    }

    @Test
    public void testSix() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int multiplier = -2;
        int[] numbers = { 1 , 2 , 0 , 0 , 5 };

        // ACT
        int[] multiplied = multiplyAll(multiplier, numbers);

        // ASSERT - w/ Message
        int[] expectedMultiplied = { -2 , -4 , 0 , 0 , -10 };
        assertEquals(expectedMultiplied, multiplied, "Expected { -2 , -4 , 0 , 0 , -10 }");
    }
}

package com.tsg.unittesting;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;




public class ArrayExerciseATest {

    /*  Test Plan:
     **  maxOfArray( {1}  ) ->  1
     **  maxOfArray( {0}  ) ->  0
     **  maxOfArray( {-1}  ) ->  -1
     **  maxOfArray( {3,4,5}  ) ->  5
     **  maxOfArray( {-9000, -700, -50, -3}  ) ->  -3
     **  maxOfArray( {-9000, 50, -3}  ) ->  50
     **  maxOfArray( {0, -1, 1}  ) ->  1
     **  maxOfArray( {1, -1, -1}  ) ->  1
     **  maxOfArray( {0, -1, -1}  ) ->  0

     */

    @Test
    public void testOne() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {1};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = 1;
        assertEquals(expectedMax, max, "Expected Max of 1");
    }

    @Test
    public void testTwo() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {0};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = 0;
        assertEquals(expectedMax, max, "Expected Max of 0");
    }

    @Test
    public void testThree() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {-1};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = -1;
        assertEquals(expectedMax, max, "Expected Max of -1");
    }

    @Test
    public void testFour() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {3,4,5};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = 5;
        assertEquals(expectedMax, max, "Expected Max of 5");
    }

    @Test
    public void testFive() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {-9000, -700, -50, -3};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = -3;
        assertEquals(expectedMax, max, "Expected Max of -3");
    }

    @Test
    public void testSix() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {-9000, 50, -3};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = 50;
        assertEquals(expectedMax, max, "Expected Max of 50");
    }

    @Test
    public void testSeven() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {0, -1, 1};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = 1;
        assertEquals(expectedMax, max, "Expected Max of 1");
    }

    @Test
    public void testEight() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {1, -1, -1};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = 1;
        assertEquals(expectedMax, max, "Expected Max of 1");
    }

    @Test
    public void testNine() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        int[] numbers = {0, -1, -1};

        // ACT
        int max = maxOfArray(numbers);

        // ASSERT - w/ Message
        int expectedMax = 0;
        assertEquals(expectedMax, max, "Expected Max of 0");
    }
}

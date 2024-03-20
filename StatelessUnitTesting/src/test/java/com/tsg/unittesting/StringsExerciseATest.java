package com.tsg.unittesting;

import static com.tsg.unittesting.strings.StringsExerciseA.yell;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class StringsExerciseATest {

    /*  Test Plan:
    **  yell( "Hello there." ) ->  "HELLO THERE."
    **  yell( "shhhhhhhhhhhh" ) ->  "SHHHHHHHHHHHH"
    **  yell( "AAaAAAaAAAaaAAHHHH" ) ->  "AAAAAAAAAAAAAAHHHH"
    **  yell( null ) -> null
    **  yell(".") -> "."
    **  yell( "AA . aAAAaAAAaaAAHHHH" ) ->  "AA . AAAAAAAAAAAAHHHH"
    */

    @Test
    public void testOne() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String word = "Hello there.";

        // ACT
        String shout = yell(word);

        // ASSERT - w/ Message
        String expectedShout = "HELLO THERE.";
        assertEquals(expectedShout, shout, "Expected: HELLO THERE.");
    }

    @Test
    public void testTwo() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String word = "shhhhhhhhhhhh";

        // ACT
        String shout = yell(word);

        // ASSERT - w/ Message
        String expectedShout = "SHHHHHHHHHHHH";
        assertEquals(expectedShout, shout, "Expected: SHHHHHHHHHHHH");
    }

    @Test
    public void testThree() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String word = "AAaAAAaAAAaaAAHHHH";

        // ACT
        String shout = yell(word);

        // ASSERT - w/ Message
        String expectedShout = "AAAAAAAAAAAAAAHHHH";
        assertEquals(expectedShout, shout, "Expected: AAAAAAAAAAAAAAHHHH");
    }

    @Test
    public void testFour() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String word = null;

        // ACT
        String shout = yell(word);

        // ASSERT - w/ Message
        String expectedShout = null;
        assertEquals(expectedShout, shout, "Expected: null");
    }

    @Test
    public void testFive() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String word = ".";

        // ACT
        String shout = yell(word);

        // ASSERT - w/ Message
        String expectedShout = ".";
        assertEquals(expectedShout, shout, "Expected: .");
    }

    @Test
    public void testSix() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String word = "AA . aAAAaAAAaaAAHHHH";

        // ACT
        String shout = yell(word);

        // ASSERT - w/ Message
        String expectedShout = "AA . AAAAAAAAAAAAHHHH";
        assertEquals(expectedShout, shout, "Expected: AA . AAAAAAAAAAAAHHHH");
    }
}

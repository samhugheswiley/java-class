package com.tsg.unittesting;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class LogicExerciseATest {

    /*  Test Plan:
    **  friendlyGreeting( "Goofus" , false ) ->   "hi"
    **  friendlyGreeting( "Gallant" , true ) ->   "Hello, Gallant!"
    **  friendlyGreeting( null , false ) ->   "..."
    **  friendlyGreeting( "Bob" , false ) ->   "hi"
    **  friendlyGreeting( "Sam" , true ) ->   "Hello, Sam!"
    **  friendlyGreeting( null , true ) ->   "..."
    */

    @Test
    public void testOne() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String visitorName = "Goofus";
        boolean isFriend = false;

        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);

        // ASSERT - w/ Message
        String expectedGreeting = "hi";
        assertEquals(expectedGreeting, greeting, "Expected Greeting: hi");
    }

    @Test
    public void testTwo() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String visitorName = "Gallant";
        boolean isFriend = true;

        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);

        // ASSERT - w/ Message
        String expectedGreeting = "Hello, Gallant!";
        assertEquals(expectedGreeting, greeting, "Expected Greeting: Hello, Gallant!");
    }

    @Test
    public void testThree() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String visitorName = null;
        boolean isFriend = false;

        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);

        // ASSERT - w/ Message
        String expectedGreeting = "...";
        assertEquals(expectedGreeting, greeting, "Expected Greeting: ...");
    }

    @Test
    public void testFour() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String visitorName = "Bob";
        boolean isFriend = false;

        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);

        // ASSERT - w/ Message
        String expectedGreeting = "hi";
        assertEquals(expectedGreeting, greeting, "Expected Greeting: hi");
    }

    @Test
    public void testFive() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String visitorName = "Sam";
        boolean isFriend = true;

        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);

        // ASSERT - w/ Message
        String expectedGreeting = "Hello, Sam!";
        assertEquals(expectedGreeting, greeting, "Expected Greeting: Hello, Sam!");
    }

    @Test
    public void testSix() {
        // The best way to test is to very clearly arrange your potential state
        // inputs and outputs, then call the thing being tested,
        // and then finally assert on the state or behaviours you want to result.

        // ARRANGE
        String visitorName = null;
        boolean isFriend = true;

        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);

        // ASSERT - w/ Message
        String expectedGreeting = "...";
        assertEquals(expectedGreeting, greeting, "Expected Greeting: ...");
    }

}

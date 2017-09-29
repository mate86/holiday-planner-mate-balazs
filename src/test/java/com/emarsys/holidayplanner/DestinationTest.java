package com.emarsys.holidayplanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DestinationTest {
    @Test
    void testNewDestinationName() {
        Destination destination = new Destination("x");
        assertEquals("x", destination.destinationName);
    }

    @Test
    void testPreviousDestinationOfNewDestination() {
        Destination destination = new Destination("x");
        assertEquals(null, destination.previousDestination);
    }
}

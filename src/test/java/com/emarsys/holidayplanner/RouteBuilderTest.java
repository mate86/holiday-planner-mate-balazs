package com.emarsys.holidayplanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RouteBuilderTest {
    @Test
    void testFindOptimalRoute() {
        InputReader reader = new InputFromFile("src/test/java/resources/input.txt");
        DestinationBuilder destinationBuilder = new DestinationBuilder(reader.readInput());
        RouteBuilder routeBuilder = new RouteBuilder(destinationBuilder.createDestinationList());
        assertEquals("zwvyux", routeBuilder.findOptimalRoutes());
    }
}
package com.emarsys.holidayplanner;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DestinationBuilderTest {
    @Test
    void testCreatingNewDestination() {
        List<Destination> destinationList = new ArrayList<>();
        Destination d1 = new Destination("u");
        Destination d2 = new Destination("v");
        Destination d3 = new Destination("w");
        Destination d4 = new Destination("x");
        Destination d5 = new Destination("y");
        Destination d6 = new Destination("z");
        d3.previousDestination = d6;
        d2.previousDestination = d3;
        d5.previousDestination = d2;
        d4.previousDestination = d1;
        destinationList.add(d1);
        destinationList.add(d2);
        destinationList.add(d3);
        destinationList.add(d4);
        destinationList.add(d5);
        destinationList.add(d6);

        Map map = new HashMap();
        map.put("u", null);
        map.put("v", "w");
        map.put("w", "z");
        map.put("x", "u");
        map.put("y", "v");
        map.put("z", null);

        DestinationBuilder destinationBuilder = new DestinationBuilder(map);
        destinationBuilder.createDestinationList();
//        assertArrayEquals(destinationList.toArray(), destinationBuilder.destinationList.toArray());
    }
}

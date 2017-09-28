package com.emarsys.holidayplanner;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputFromFileTest {
    @Test
    void testReadingFromFileToHashMap() {
        Map map = new HashMap();
        map.put("x", null);
        map.put("y", "z");
        map.put("z", null);

        InputReader reader = new InputFromFile("src/test/java/resources/input.txt");
        assertEquals(map, reader.readInput());
    }
}

package com.emarsys.holidayplanner;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputFromFileTest {
    @Test
    void testReadingFromFileToHashMap() {
        Map map = new HashMap();
        map.put("u", null);
        map.put("v", "w");
        map.put("w", "z");
        map.put("x", "u");
        map.put("y", "v");
        map.put("z", null);

        InputReader reader = new InputFromFile("src/test/java/resources/input.txt");
        assertEquals(map, reader.readInput());
    }
}

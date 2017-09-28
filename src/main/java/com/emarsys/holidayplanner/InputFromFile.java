package com.emarsys.holidayplanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputFromFile implements InputReader {
    private String filePath;

    public InputFromFile(String fileName) {
        this.filePath = fileName;
    }

    @Override
    public Map readInput() {
        Map map = new HashMap();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                String[] strings = scanner.nextLine().split("=>");
                if (strings.length == 1) {
                    map.put(strings[0].trim(), null);
                } else {
                    map.put(strings[0].trim(), strings[1].trim());
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return map;
    }
}
